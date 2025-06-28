function solution(dartResult) {
    let scores = [];
    let currTurn = 0;
    const turns = Array(3).fill(null).map(() => ({}));
   
    for (let i = 0; i < dartResult.length; i++) {        
        if (dartResult[i] + dartResult[i + 1] === '10') {
            turns[currTurn].score = 10;
            i += 1;
        } else if (Number(dartResult[i]) >= 0) {
            turns[currTurn].score = Number(dartResult[i]);
        } else if (['S', 'D', 'T'].includes(dartResult[i])) {
            turns[currTurn].bonus = dartResult[i];
            
            const next = dartResult[i + 1];
            if (['#', '*'].includes(next)) {
                turns[currTurn].option = next;
            }
            currTurn += 1;
        }
    }
    
    for (let i = 0; i < 3; i++) {
        const turn = turns[i];
        let score = turn.score;
        
        if (turn.bonus === 'D') {
            score = Math.pow(score, 2);
        } else if (turn.bonus === 'T') {
            score = Math.pow(score, 3);
        }
        
        if (turn.option === '#') {
            score *= -1;
        } else if (turn.option === '*') {
            score *= 2;
            scores[i - 1] *= 2;           
        }
        
        scores.push(score);
    }
    return scores.reduce((acc, cur) => acc + cur, 0);
}