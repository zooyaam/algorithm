function solution(str_list) {
    const li = str_list.indexOf('l');
    const ri = str_list.indexOf('r');
    
    if (li === -1 && ri === -1) return [];
    
    if (li !== -1 && (ri === -1 || li < ri)) {
        return str_list.slice(0, li);
    } else if (ri !== -1 && (li === -1 || ri < li)) {
        return str_list.slice(ri + 1);
    }
    
    return [];
}
