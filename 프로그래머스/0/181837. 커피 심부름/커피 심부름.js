function solution(order) {
    return order.reduce((acc, cur) => {
        acc = cur.includes('americano') || cur === 'anything' 
            ? acc + 4500 
            : acc + 5000;
        return acc;
    }, 0);
}
