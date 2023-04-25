import React from 'react'
import { useNavigate } from 'react-router'

function Header(props) {

  const navigator = useNavigate()

  const signOut = () => {
    localStorage.removeItem("email")
    props.setUser({
      email: '',
      password: '',
      name: ''
    })
    navigator('/')
  }

  const renderHeader = () => {
    if (props.user.id === undefined) {
      return (
        <div className='flex-row header'>
          <a href="/SignIn" className="links">Sign In</a>
          <a href="/" className="links">Home</a>
          <a href="/SignUp" className="links">Sign Up</a>
        </div>
      )
    } else {
      return (
        <div className='flex-row header'>
          <a href="/" className="links">Home</a>
          <button onClick={signOut}>Sign Out</button>
        </div>
      )
    }
  }

  return (
    renderHeader()
  )
}

export default Header