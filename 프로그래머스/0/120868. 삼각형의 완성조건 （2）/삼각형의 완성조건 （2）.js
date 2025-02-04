function solution(sides) {
    const [a, b] = sides;
    return (a+b-1) - Math.abs(a-b)
}