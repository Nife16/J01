import React from 'react'

function TopFiveStats(props) {
    return (
        <div className='flex-col'>
            <h4>Top 5 {props.stat.toUpperCase()}</h4>
            {
                props.top5.map((player) => {
                    return (
                        <div>{player.name} : {player.position} : {player.stats[props.stat]}</div>
                    )
                })
            }
        </div>
    )
}

export default TopFiveStats