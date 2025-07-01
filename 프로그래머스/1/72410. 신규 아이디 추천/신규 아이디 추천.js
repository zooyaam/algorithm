function solution(new_id) {
    let id = new_id.toLowerCase();
    id = id.replace(/[^a-z\d\-\_\.]/g, '');
    id = id.replace(/\.{2,}/g, '.');
    id = id.replace(/^\.|\.$/g, '');
    
    if (id === '') id += 'a';
    if (id.length >= 16) id = id.substring(0, 15);
    
    id = id.replace(/\.$/, '');
    
    if (id.length <= 2) {
        const char = id.slice(-1);
        
        while (id.length < 3) {
            id += char;
        }
    }
    
    return id;
}