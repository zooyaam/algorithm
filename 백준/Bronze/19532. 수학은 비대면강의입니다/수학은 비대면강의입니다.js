[a,b,c,d,e,f] = (require('fs').readFileSync('/dev/stdin')+'').split(' ');
t = a * e - b * d;
console.log(`${(c * e - b * f) / t} ${(a * f - c * d) / t}`);

