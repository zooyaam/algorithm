function solution(id_list, report, k) {
    const countMap = new Map(id_list.map((id) => [id, 0]));
    const reportMap = new Map(id_list.map((id) => [id, []]));
    
    for (const r of report) {
        const [user, reported] = r.split(' ');
        const reportList = reportMap.get(user);
        
        if (!reportList.includes(reported)) {
            reportList.push(reported);
            countMap.set(reported, countMap.get(reported) + 1);
        }
    }
    
    const countArr = Array.from(countMap);
    const list = countArr.map(([key, value]) => value >= k && key);
    
    const result = [];
    for (const [key, val] of reportMap) {
        const set = new Set(val);
        const cnt = list.filter((el) => set.has(el)).length;
        
        result.push(cnt);
    }
    return result;
}