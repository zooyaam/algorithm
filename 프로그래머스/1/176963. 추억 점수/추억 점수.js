function solution(name, yearning, photo) {
    let result = [];
    let score = {};

    name.forEach((s, i) => {
        score[s] = yearning[i];
    });
    
    photo.forEach((item) => {
        let totalScore = 0;
        
        item.forEach((p) => {
            if (score[p]) {
                totalScore += score[p];
            }
        });
        
        result.push(totalScore);
    });
    
    return result;
}
