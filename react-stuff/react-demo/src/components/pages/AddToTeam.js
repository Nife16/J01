import axios from 'axios'
import React, { useEffect, useState } from 'react'
import AllPlayers from '../reusables/AllPlayers'
import AllTeams from '../reusables/AllTeams'
import Modal from '../reusables/Modal'

function AddToTeam() {

    const [activeTeam, setActiveTeam] = useState({})
    const [teams, setTeams] = useState([])
    const [players, setPlayers] = useState([])
    const [isModelOpen, setIsModalOpen] = useState(false)

    useEffect(() => {

        axios.get('http://localhost:8080/team/findAll')
            .then((response) => {
                setTeams(response.data)
            })
            .catch((e) => {
                console.log(e)
            })

    }, [])

    const addPlayerToTeam = (event) => {

        const playerId = event.target.id
        axios.post(`http://localhost:8080/team/addPlayer/${playerId}`, activeTeam)
        .then((response) => {
            setActiveTeam(response.data)
        })
        .catch((e) => {
            console.log(e)
        })

    }

    const renderModal = () => {
        
        if(isModelOpen) {
            return (
                <Modal title={"Add players"} setIsModalOpen={setIsModalOpen}>
                    <AllPlayers players={players} activeTeam={activeTeam} addPlayerToTeam={addPlayerToTeam} />
                </Modal>
            )
        } else {
            return null
        }
    }

    const getFilteredList = (allDaPlayers, activeTeam) => {

        for (let index = 0; index < activeTeam.players.length; index++) {
            
            allDaPlayers = allDaPlayers.map((player) => {

                if(activeTeam.players[index].id !== player.id) {
                    console.log("here")
                    return player
                }

            })
            
        }

        return allDaPlayers

    }

    const openModal = (event) => {

        let activeTeam
        axios.get(`http://localhost:8080/team/findById/${event.target.id}`)
            .then((response) => {
                activeTeam = response.data
                setActiveTeam(response.data)
            })
            .catch((e) => {
                console.log(e)
            })
        
        axios.get('http://localhost:8080/player/findAll')
            .then((response) => {
                const listOfPlayers = getFilteredList(response.data, activeTeam)

                setPlayers(response.data)
            })
            .catch((e) => {
                console.log(e)
            })

        setIsModalOpen(true)
    }

    const renderTeams = () => {

        if (teams.lengh === 0) {
            return null
        } else {
            return (
                <AllTeams teams={teams} onClick={openModal} />
            )
        }
    }

    return (
        <div className='flex-col center'>
            {renderTeams()}
            {renderModal()}
        </div>
    )
}

export default AddToTeam