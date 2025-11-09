function solution(answers) {
    const u1 = { id: 1, score: 0, pattern: [1, 2, 3, 4, 5] };
    const u2 = { id: 2, score: 0, pattern: [2, 1, 2, 3, 2, 4, 2, 5] };
    const u3 = { id: 3, score: 0, pattern: [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] };

    answers.forEach((answer, i) => {
        const num1 = u1.pattern[i % 5];
        const num2 = u2.pattern[i % 8];
        const num3 = u3.pattern[i % 10];

        if (num1 === answer) u1.score++;
        if (num2 === answer) u2.score++;
        if (num3 === answer) u3.score++;
    });

    const users = [u1, u2, u3];
    const maxScore = Math.max(...users.map(u => u.score));
    
    return users.filter(u => u.score === maxScore).map(u => u.id);
}
