import React, { useState } from 'react'
import '../css/box.css'

function Box(props) {

    return (
        <div id={props.id} className='box' onClick={props.putXorO}>
            {props.value}
        </div>
    )
}

export default Box