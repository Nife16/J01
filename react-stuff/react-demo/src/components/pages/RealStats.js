import axios from 'axios'
import React, { useEffect, useState } from 'react'

function RealStats(props) {

    const [nbaTeams, setNbaTeams] = useState([])

    useEffect(() => {

        const options = {
            headers: {
                'X-RapidAPI-Key': '27263435femshf27333c4b094968p1e18cajsnf5379626f01f',
                'X-RapidAPI-Host': 'free-nba.p.rapidapi.com'
            }
        }

        axios.get('https://free-nba.p.rapidapi.com/teams', options)
            .then((response) => {
                setNbaTeams(response.data.data)
            })
            .catch((e) => {
                console.log(e)
            })

    }, [])

    const renderContent = () => {

        if (nbaTeams.length === 0) {
            return null
        } else {
            return (
                <div className='flex-col center'>
                    {nbaTeams.map((team) => {
                        console.log("here")
                        return (
                            <div>
                                {team.name}
                            </div>
                        )
                    })}
                </div>
            )
        }

    }

    return (
        renderContent()
    )
}

export default RealStats