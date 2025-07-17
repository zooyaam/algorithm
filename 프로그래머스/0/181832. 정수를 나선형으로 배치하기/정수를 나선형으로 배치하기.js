function solution(n) {
    const dx = [0, 1, 0, -1];
    const dy = [1, 0, -1, 0];
    
    const arr = Array.from({ length: n }, () => Array(n).fill(0));
    
    let x = 0, y = 0, dir = 0;
    for (let i = 1; i <= n * n; i++) {
        arr[x][y] = i;

        let nx = x + dx[dir];
        let ny = y + dy[dir];

        if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] !== 0) {
            dir = (dir + 1) % 4;
            nx = x + dx[dir];
            ny = y + dy[dir];
        }

        x = nx;
        y = ny;
    }

    return arr;
}
