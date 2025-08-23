function solution(n) {
  while (n % 2 === 0) n /= 2;

  let m = n;
  let count = 1;

  for (let i = 3, exp; i * i <= m; i += 2) {
    if (m % i === 0) {
      exp = 0;
      while (m % i === 0) {
        m /= i;
        exp++;
      }
      count *= (exp + 1);
    }
  }
    
  if (m > 1) count *= 2;
  return count;
}