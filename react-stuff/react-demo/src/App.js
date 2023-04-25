import { useEffect, useState } from 'react';
import './App.css';
import PageWrapper from './components/reusables/PageWrapper';
import { Routes, Route } from 'react-router-dom'
import Home from './components/pages/Home';
import SignUp from './components/pages/SignUp';
import SignIn from './components/pages/SignIn';
import axios from 'axios';
import Game from './components/pages/Game';
import AddToTeam from './components/pages/AddToTeam';
import RealStats from './components/pages/RealStats';

function App() {
  const [user, setUser] = useState({
    email: '',
    password: '',
    name : ''
  })
  const [isLoading, setIsLoading] = useState(true)

  useEffect(() => {

    const email = localStorage.getItem("email")
    axios.get(`http://localhost:8080/user/getUserByEmail/${email}`)
    .then((response) => {
      setUser(response.data)
      setIsLoading(false)
    })
    .catch((e) => {
      console.log(e)
    })
  }, [])

  return (
    <PageWrapper 
      user={user} setUser={setUser}
    >
      <Routes>
        <Route path='/' element={<Home user={user} />} />
        <Route path='/SignUp' element={<SignUp user={user} setUser={setUser} />} />
        <Route path='/SignIn' element={<SignIn user={user} setUser={setUser} />} />
        <Route path='/game' element={<Game user={user} />} />
        <Route path='/addPlayerToTeam' element={<AddToTeam user={user} />} />
        <Route path='/realStats' element={<RealStats user={user} />} />
      </Routes>
    </PageWrapper>
  )
}

export default App;
