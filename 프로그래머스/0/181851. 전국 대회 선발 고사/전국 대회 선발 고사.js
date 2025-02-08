function solution(rank, attendance) {
    const array = rank
        .map((num, i) => ({rank: num, index: i}))
        .filter(({index}) => attendance[index])
        .sort((a, b) => a.rank - b.rank);
    
    const [a, b, c] = array.slice(0, 3).map(({index}) => index);
    return 10000 * a + 100 * b + c;
}