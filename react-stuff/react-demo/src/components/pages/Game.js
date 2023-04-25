import axios from 'axios'
import React, { useEffect, useState } from 'react'

function Game() {

  const [games, setGames] = useState([])
  const [isLoading, setIsLoading] = useState(true)

  useEffect(() => {
    
    axios.get("http://localhost:8080/games/findAll")
    .then((response) => {
      console.log(response.data)
      setGames(response.data)
      setIsLoading(false)
    })
    .catch((e) => {
      console.log(e)
    })

  }, [])

  const renderContent = () => {

    if(isLoading) {
      return (
        null
      )
    } else {
      return (
        <div>Game</div>
      )
    }
    
  }

  return (
    renderContent()
  )
}

export default Game