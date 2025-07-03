function solution(friends, gifts) {
    const scoreMap = new Map(); // 선물 지수
    const gaveMap = new Map(); // 받을 선물 갯수
    const giftObj = {}; // 선물 기록
    
    for (const friend of friends) {
        scoreMap.set(friend, 0);
        gaveMap.set(friend, 0);
        giftObj[friend] = {};
        
        for (const other of friends) {
            if (other !== friend) giftObj[friend][other] = 0;
        }
    }

    for (const gift of gifts) {
        const [a, b] = gift.split(' ');
        
        giftObj[a][b] += 1;
        scoreMap.set(a, scoreMap.get(a) + 1);
        scoreMap.set(b, scoreMap.get(b) - 1);
    } 
    
    for (let i = 0; i < friends.length; i++) {
        for (let j = i + 1; j < friends.length; j++) {
            const f1 = friends[i];
            const f2 = friends[j];
            const f1Tof2 = giftObj[f1][f2];
            const f2Tof1 = giftObj[f2][f1];
            
             if (f1Tof2 > f2Tof1) {
                    gaveMap.set(f1, gaveMap.get(f1) + 1);
                } else if (f1Tof2 < f2Tof1) {
                    gaveMap.set(f2, gaveMap.get(f2) + 1);
                } else {
                    if (scoreMap.get(f1) > scoreMap.get(f2)) {
                        gaveMap.set(f1, gaveMap.get(f1) + 1);
                    } else if (scoreMap.get(f1) < scoreMap.get(f2)) {
                        gaveMap.set(f2, gaveMap.get(f2) + 1);
                    }
                }
        }
    }

    const values = [...gaveMap.values()];
    return Math.max(...values);
}