import axios from 'axios'
import React, { useEffect, useState } from 'react'
import AllTeams from '../reusables/AllTeams'
import TopFiveStats from '../reusables/TopFiveStats'

function Home(props) {
  const [teams, setTeams] = useState([])
  const [top5Points, setTop5Points] = useState([])
  const [top5Assists, setTop5Assists] = useState([])
  const [top5Rebounds, setTop5Rebounds] = useState([])
  const [top5Steal, setTop5Steals] = useState([])
  const [top5ThreesMade, setTop5ThreesMade] = useState([])
  const [top5Blocks, setTop5Blocks] = useState([])
  const [isLoading, setIsLoading] = useState(true)

  useEffect(() => {
    axios.get('http://localhost:8080/team/findAll')
      .then((response) => {
        setTeams(response.data)
        setIsLoading(false)
      })
      .catch((e) => {
        console.log(e)
      })

    axios.get('http://localhost:8080/player/findTop5Points')
      .then((response) => {
        setTop5Points(response.data)
      })
      .catch((e) => {
        console.log(e)
      })
    axios.get('http://localhost:8080/player/findTop5Assists')
      .then((response) => {
        setTop5Assists(response.data)
      })
      .catch((e) => {
        console.log(e)
      })
    axios.get('http://localhost:8080/player/findTop5Rebounds')
      .then((response) => {
        setTop5Rebounds(response.data)
      })
      .catch((e) => {
        console.log(e)
      })
    axios.get('http://localhost:8080/player/findTop5Steals')
      .then((response) => {
        setTop5Steals(response.data)
      })
      .catch((e) => {
        console.log(e)
      })
    axios.get('http://localhost:8080/player/findTop5Blocks')
      .then((response) => {
        setTop5Blocks(response.data)
      })
      .catch((e) => {
        console.log(e)
      })
    axios.get('http://localhost:8080/player/findTop5ThreesMade')
      .then((response) => {
        setTop5ThreesMade(response.data)
      })
      .catch((e) => {
        console.log(e)
      })

  }, [])

  const renderContent = () => {

    console.log(top5Blocks)
    if (isLoading) {
      return null
    } else {
      return (
        <div className='flex-col center'>
          <AllTeams teams={teams} />
          <div className='flex-row'>
            <TopFiveStats top5={top5Points} stat={'points'} />
            <TopFiveStats top5={top5Assists} stat={'assits'} />
            <TopFiveStats top5={top5Rebounds} stat={'rebounds'} />
            <TopFiveStats top5={top5ThreesMade} stat={'threesMade'} />
            <TopFiveStats top5={top5Blocks} stat={'blocks'} />
            <TopFiveStats top5={top5Steal} stat={'steals'} />
          </div>
        </div>
      )
    }

  }

  return (
    renderContent()
  )
}

export default Home