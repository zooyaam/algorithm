function solution(food) {
    let temp = [];
    
    for (let i = 1; i < food.length; i++) {
        if (food[i] % 2 === 1) food[i] -= 1;
        temp.push(String(i).repeat(food[i] / 2));
    }
    
    let result = temp.join('') + '0' + temp.reverse().join('');
    
    return result;
}
