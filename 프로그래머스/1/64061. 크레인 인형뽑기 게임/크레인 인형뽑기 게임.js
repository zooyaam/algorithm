function solution(board, moves) {
    let count = 0;
    const basket = [];
    
    for (const move of moves) {
        const doll = moveDoll(move - 1, board);
        const lastDoll = basket[basket.length - 1];
        if (doll) {
            if (lastDoll !== doll) {
                basket.push(doll);
            } else {
                basket.pop();
                count += 2;
            }
        }     
    }  
    
    return count;
}

function moveDoll(column, board) {
    let col = board.map((row) => row[column]);
    let idx = col.findIndex((doll) => doll !== 0);
    
    if (idx >= 0) {
        let doll = col[idx];
        board[idx][column] = 0;    
        
        return doll;
    }
}
