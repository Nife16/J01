import axios from 'axios';
import React from 'react'
import { useNavigate } from 'react-router';

function SignUp(props) {

  const navigator = useNavigate()

  const changeHandler = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    const tempUser = { ...props.user };
    tempUser[name] = value;
    props.setUser(tempUser)
  }

  const submitHandler = () => {

      axios.post('http://localhost:8080/user/signUp', props.user)
      .then((response) => {
        localStorage.setItem("email", response.data.email)
        props.setUser(response.data)
        navigator('/')
      })
      .catch((e) => {
        console.log(e)
      })

  }


  return (
    <div>
      <div>
        Name:
        <input onChange={changeHandler} value={props.user.name} type='text' name='name' />
      </div>
      <div>
        Email:
        <input onChange={changeHandler} value={props.user.email} type='text' name='email' />
      </div>
      <div>
        Password:
        <input onChange={changeHandler} value={props.user.password} type='password' name='password' />
      </div>
      <button onClick={submitHandler}>Submit Me!</button>
    </div>
  )
}

export default SignUp