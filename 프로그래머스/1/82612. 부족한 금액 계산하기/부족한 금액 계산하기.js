function solution(price, money, count) {
    let cost = ((count*(count + 1))/2) * price
    let balance = money - cost;
    let answer = 0;
    balance >= 0 ? answer = 0 : answer = Math.abs(balance)
    
    return answer
}