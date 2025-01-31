function solution(emergency) {
    const sortArr = [...emergency].sort((a, b) => b - a);
    
    return emergency.reduce((acc, cur) => {
        acc.push(sortArr.indexOf(cur) + 1);
        return acc;
    }, [])
}