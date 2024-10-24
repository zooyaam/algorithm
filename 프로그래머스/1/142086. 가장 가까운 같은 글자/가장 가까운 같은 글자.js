function solution(s) {
  let result = [];
  let last = {};

  Array.from(s).forEach((char, idx) => {
    if (last[char] !== undefined) {
      result[idx] = idx - last[char];
    } else {
      result[idx] = -1;
    }
    
    last[char] = idx;
  });

  return result;
}