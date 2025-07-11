const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });

    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === 2) rl.close();
    }

    const [N, K] = input[0].split(' ').map(Number);
    const A = input[1].split(' ').map(Number);
    let count = 0;
    let result = -1;

    const mergeSort = (arr, p, r) => {
        if (p < r) {
            const q = Math.floor((p + r) / 2);
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    };

    const merge = (arr, p, q, r) => {
        const tmp = [];
        let i = p, j = q + 1;

        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp.push(arr[i++]);
            } else {
                tmp.push(arr[j++]);
            }
        }

        while (i <= q) tmp.push(arr[i++]);
        while (j <= r) tmp.push(arr[j++]);

        for (let t = 0; t < tmp.length; t++) {
            arr[p + t] = tmp[t];

            count++;
            if (count === K) {
                result = arr[p + t];
            }
        }
    };
    mergeSort(A, 0, A.length - 1);
    
    console.log(result);
})();
