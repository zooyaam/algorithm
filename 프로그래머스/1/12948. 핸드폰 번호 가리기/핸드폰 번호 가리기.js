function solution(phone_number) {
    let arr = [...phone_number]
    let hide = arr.slice(0, arr.length - 4)
    const show = arr.slice(arr.length - 4)
    
    hide = hide.map((num) => '*')
    arr = hide.concat(show)
    
    return arr.join('')
    
}