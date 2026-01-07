function solution(people, limit) {
    people.sort((a, b) => a - b);
    
    let cnt = 0;
    let [s, e] = [0, people.length - 1];
    
    while (s <= e) {
        if (people[s] + people[e] <= limit) {
            s++;
        }
        
        e--;
        cnt++;
    }
    return cnt;
}