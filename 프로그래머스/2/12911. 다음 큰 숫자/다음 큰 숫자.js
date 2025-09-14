function solution(n) {
    const nCnt = n.toString(2).split("1").length - 1;

    let next = n + 1;

    while (true) {
        const nextBin = next.toString(2);
        const nextCnt = nextBin.split("1").length - 1;

        if (nextCnt === nCnt) {
            return next;
        }

        next++;
    }
}
