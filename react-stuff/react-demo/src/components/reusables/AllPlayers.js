import { faPlus } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import React from 'react'

function AllPlayers(props) {

    return (
        <div className='flex-col logo-row'>
            <div>{props.activeTeam.name}</div>
            {
                props.players.map((player) => {
                    return (
                        <div>
                            <div className='flex-col logo-box modal-col'>
                                <div className='justify-center logo-text'>{player.name}</div>
                                <div className='justify-center logo-text'>{player.position}</div>
                            </div>
                            <div className='flex-col logo-box justify-right modal-col'>
                                <FontAwesomeIcon icon={faPlus} className="x-close pointer" id={player.id} onClick={props.addPlayerToTeam} />
                            </div>
                        </div>

                    )
                })
            }
        </div>
    )

}

export default AllPlayers