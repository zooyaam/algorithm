function solution(keyinput, board) {
    let position = [0, 0];

    const limitX = Math.floor(board[0] / 2);
    const limitY = Math.floor(board[1] / 2);

    for (let key of keyinput) {
        switch (key) {
            case "left":
                if (position[0] > -limitX) position[0] -= 1;
                break;
            case "right":
                if (position[0] < limitX) position[0] += 1;
                break;
            case "up":
                if (position[1] < limitY) position[1] += 1;
                break;
            case "down":
                if (position[1] > -limitY) position[1] -= 1;
                break;
        }
    }

    return position;
}
