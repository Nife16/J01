import React, { useState } from 'react'
import '../css/board.css'
import Box from './Box'

function Board() {

    const [ifXisNext, setIfXisNext] = useState(true)
    const [squares, setSquares] = useState(Array(9).fill(null))

    const putXorO = (event) => {

        if (squares[event.target.id] || calculateWinner()) {
            return
        }

        const nextSquares = squares.slice()

        if (ifXisNext) {
            nextSquares[event.target.id] = "X"
        } else {
            nextSquares[event.target.id] = "O"
        }

        setSquares(nextSquares)
        setIfXisNext(!ifXisNext)

    }

    function calculateWinner() {
        const lines = [
            [0, 1, 2],
            [3, 4, 5],
            [6, 7, 8],
            [0, 3, 6],
            [1, 4, 7],
            [2, 5, 8],
            [0, 4, 8],
            [2, 4, 6],
        ];
        for (let i = 0; i < lines.length; i++) {
            const [a, b, c] = lines[i];
            if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
                return squares[a];
            }
        }
        return null;
    }

    return (
        <div className='main-content flex-col'>
            <div className='game-board flex-col'>
                <div className='flex-row row-height'>
                    <Box id={0} value={squares[0]} putXorO={putXorO} />
                    <Box id={1} value={squares[1]} putXorO={putXorO} />
                    <Box id={2} value={squares[2]} putXorO={putXorO} />
                </div>
                <div className='flex-row row-height'>
                    <Box id={3} value={squares[3]} putXorO={putXorO} />
                    <Box id={4} value={squares[4]} putXorO={putXorO} />
                    <Box id={5} value={squares[5]} putXorO={putXorO} />
                </div>
                <div className='flex-row row-height'>
                    <Box id={6} value={squares[6]} putXorO={putXorO} />
                    <Box id={7} value={squares[7]} putXorO={putXorO} />
                    <Box id={8} value={squares[8]} putXorO={putXorO} />
                </div>
            </div>
        </div>
    )
}

export default Board