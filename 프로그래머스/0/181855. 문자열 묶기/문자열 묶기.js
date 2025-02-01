function solution(strArr) {
    const lengthMap = new Map();

    for (const str of strArr) {
        const len = str.length;
        lengthMap.set(len, (lengthMap.get(len) || 0) + 1);
    }

    return Math.max(...lengthMap.values());
}
