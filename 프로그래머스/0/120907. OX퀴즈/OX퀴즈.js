function solution(quiz) {
    return quiz.map((q, i) => {
        const [l, r] = q.split(' = ');
        const calc = new Function(`return ${l}`);
        return calc() == r ? 'O' : 'X'
    })
}