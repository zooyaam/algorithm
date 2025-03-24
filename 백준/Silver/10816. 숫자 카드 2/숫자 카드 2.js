const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const N = Number(input[0]);
const M = Number(input[2]);
const has = input[1].split(' ').map(Number).sort((a, b) => a - b);
const cards = input[3].split(' ').map(Number);

function solution(arr, target) {
    function lowerBound(arr, target) {
        let left = 0, right = arr.length;
        while (left < right) {
            let mid = Math.floor((left + right) / 2);
            if (arr[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    function upperBound(arr, target) {
        let left = 0, right = arr.length;
        while (left < right) {
            let mid = Math.floor((left + right) / 2);
            if (arr[mid] > target) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    return upperBound(arr, target) - lowerBound(arr, target);
}

console.log(cards.map(card => solution(has, card)).join(' '));