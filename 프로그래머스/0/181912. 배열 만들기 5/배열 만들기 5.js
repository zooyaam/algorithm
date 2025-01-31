function solution(intStrs, k, s, l) {
    return intStrs.reduce((acc, cur) => {
        const num = Number(cur.substring(s, s+l));
        if(num > k) {
            acc.push(num);
        }
        return acc;
    }, [])
}