import React from 'react'

function AllTeams(props) {

    return (
        <div className='flex-row logo-row'>
            {
                props.teams.map((team) => {
                    return (
                        <div className='flex-col logo-box'>
                            <img id={team.id} src={team.logo} className="logo" onClick={props.onClick} />
                            <div className='justify-center logo-text'>{team.name}</div>
                        </div>
                    )
                })
            }
        </div>
    )
}

export default AllTeams