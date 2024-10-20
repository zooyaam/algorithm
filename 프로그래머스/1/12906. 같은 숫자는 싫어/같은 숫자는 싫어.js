function solution(arr)
{
    let ans = [];
    for(let i=0; i<arr.length; i++){
        if(i === 0 || arr[i] !== arr[i-1]) ans.push(arr[i])
    }
    return ans;
}