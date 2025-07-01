function solution(numbers, hand) {
    const keypad = {
        1: [0, 0], 2: [0, 1], 3: [0, 2],
        4: [1, 0], 5: [1, 1], 6: [1, 2],
        7: [2, 0], 8: [2, 1], 9: [2, 2],
        0: [3, 1],
    };

    const leftKeys = new Set([1, 4, 7]);
    const rightKeys = new Set([3, 6, 9]);

    let leftPos = [3, 0];
    let rightPos = [3, 2];
    let result = '';

    const getDistance = (from, to) =>
        Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);

    const decideHand = (num) => {
        const target = keypad[num];

        if (leftKeys.has(num)) return ['L', target];
        if (rightKeys.has(num)) return ['R', target];

        const leftDist = getDistance(leftPos, target);
        const rightDist = getDistance(rightPos, target);

        if (leftDist < rightDist) return ['L', target];
        if (rightDist < leftDist) return ['R', target];

        return hand === 'left' ? ['L', target] : ['R', target];
    };

    for (const num of numbers) {
        const [chosen, pos] = decideHand(num);

        result += chosen;
        if (chosen === 'L') leftPos = pos;
        else rightPos = pos;
    }

    return result;
}