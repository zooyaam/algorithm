function solution(babbling) {
  const canSay = ["aya", "ye", "woo", "ma"];
  let count = 0;

  for (let word of babbling) {
    let tmp = word;

    while (tmp.length > 0) {
      let found = false;

      for (let say of canSay) {
        if (tmp.startsWith(say)) {
          tmp = tmp.slice(say.length);
          found = true;
          break;
        }
      }
      if (!found) break;
    }
    if (tmp === "") count++;
  }

  return count;
}
