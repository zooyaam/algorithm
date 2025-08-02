function solution(s) {
    let str = s;
    let convert = 0; // 변환 횟수
    let zero = 0; // 없어진 0의 갯수
    
    while (str !== '1') {
        let tmp = str.replaceAll('0', '');
        zero += str.length - tmp.length;
        str = tmp.length.toString(2);
        convert++;
    }
    
    return [convert, zero];
}