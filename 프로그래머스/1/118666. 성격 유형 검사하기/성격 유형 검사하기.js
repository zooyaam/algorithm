function solution(survey, choices) {
    const typeScore = {
        "R": 0, "T": 0,
        "C": 0, "F": 0,
        "J": 0, "M": 0,
        "A": 0, "N": 0
    }
    const score = {
        1: 3, 2: 2, 3: 1, 
        4: 0, 
        5: 1, 6: 2, 7: 3
    }
    
    
    for (let i = 0; i < survey.length; i++) {
        const [t1, t2] = survey[i].split('');
        const choice = choices[i];
        
        if (choice < 4) {
            typeScore[t1] += score[choice];
        } else {
            typeScore[t2] += score[choice];
        }
    }
    
    const result = [
        typeScore["R"] >= typeScore["T"] ? "R" : "T",
        typeScore["C"] >= typeScore["F"] ? "C" : "F",
        typeScore["J"] >= typeScore["M"] ? "J" : "M",
        typeScore["A"] >= typeScore["N"] ? "A" : "N",
    ];
    
    return result.join('');
}