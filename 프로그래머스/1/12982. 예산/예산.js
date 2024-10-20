function solution(d, budget) {
    let sum = 0;
    return d
        .sort((a, b) => a - b)
        .filter(price => {
            sum += price;
            return sum <= budget;
        }).length;
}