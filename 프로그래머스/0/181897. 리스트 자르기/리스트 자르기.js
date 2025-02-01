function solution(n, slicer, num_list) {
    const [a, b, c] = slicer;
    
    switch (n) {
        case 1:
            return num_list.slice(0, b+1);
            break;
        case 2:
            return num_list.slice(a);
            break;
        case 3:
            return num_list.slice(a, b+1);
            break;
        case 4:
            let result = [];
            for(let i=a; i<=b; i+=c) {
                result.push(num_list[i]);
            }
            return result;
            break;
            
    }
}