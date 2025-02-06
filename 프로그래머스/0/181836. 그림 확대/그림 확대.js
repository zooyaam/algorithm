function solution(picture, k) {
    return picture.flatMap(row => 
        Array(k).fill(row.split('').map(pixcel => pixcel.repeat(k)).join(''))
    );
}