function solution(N, stages) {
    const result = [];
    const stageCounts = Array(N + 2).fill(0);

    for (const stage of stages) {
        stageCounts[stage]++;
    }

    let total = stages.length;

    for (let i = 1; i <= N; i++) {
        const fail = stageCounts[i];
        const failureRate = total === 0 ? 0 : fail / total;
        result.push([i, failureRate]);
        total -= fail;
    }

    result.sort((a, b) => b[1] - a[1]);

    return result.map(([stage]) => stage);
}
