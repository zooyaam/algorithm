function solution(spell, dic) {
    return dic.some((word) => 
        new Set(word).size === spell.length && 
        spell.every(char => word.includes(char))
    ) ? 1 : 2;
}
