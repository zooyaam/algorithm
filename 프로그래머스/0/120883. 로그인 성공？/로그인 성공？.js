function solution(id_pw, db) {
    return db.some(data => data[0] === id_pw[0] && data[1] !== id_pw[1])
        ? 'wrong pw'
        : db.some(data => data[0] === id_pw[0] && data[1] === id_pw[1])
            ? 'login'
            : 'fail'
}
