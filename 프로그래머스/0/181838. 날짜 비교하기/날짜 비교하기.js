function solution(date1, date2) {
    const [y1, m1, d1] = date1;
    const [y2, m2, d2] = date2;
    
    if (y2 > y1) return 1;
    if (y2 < y1) return 0;
    if (m2 > m1) return 1;
    if (m2 < m1) return 0;
    return d2 > d1 ? 1 : 0;
}