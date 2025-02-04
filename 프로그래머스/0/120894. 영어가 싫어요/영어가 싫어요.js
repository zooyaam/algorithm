function solution(numbers) {
    const arr = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    
    let result = "";
    let i = 0;

    while (i < numbers.length) {
        for (let j = 0; j < arr.length; j++) {
            if (numbers.startsWith(arr[j], i)) {
                result += j;
                i += arr[j].length;
                break;
            }
        }
    }
    return Number(result);

}