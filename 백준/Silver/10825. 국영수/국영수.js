const readline = require('readline');

(async () => {
    const rl = readline.createInterface({ input: process.stdin });

    const input = [];
    for await (const line of rl) {
        input.push(line.trim());
        if (input.length === Number(input[0]) + 1) rl.close();
    }

    const grades = input.slice(1).map((line) => {
        const [name, ko, en, mt] = line.split(' ');
        return {
            name,
            ko: Number(ko),
            en: Number(en),
            mt: Number(mt)
        };
    });

    grades.sort((a, b) => {
        if (a.ko !== b.ko) return b.ko - a.ko;
        if (a.en !== b.en) return a.en - b.en;
        if (a.mt !== b.mt) return b.mt - a.mt;
        return a.name < b.name ? -1 : a.name > b.name ? 1 : 0;
    });

    console.log(grades.map(g => g.name).join('\n'));
})();
