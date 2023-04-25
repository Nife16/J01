import React from 'react'
import '../../css/main-content.css'

function MainContent(props) {
    return (
        <div className='main-content flex-row'>
            {props.children}
        </div>
    )
}

export default MainContent