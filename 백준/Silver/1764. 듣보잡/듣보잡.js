const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {
    const out = [];

    const heardMap = new Map();
    let count = 0;

    const [n, m] = input[0].split(" ").map(Number);
    for (let i = 1; i <= n; i++) {
        heardMap.set(input[i], i);
    }

    for (let i = n+1; i < input.length; i++) {
        if (heardMap.has(input[i])) {
            out.push(input[i]);
            count++;
        }
    }
    out.sort();
    out.unshift(count);
    console.log(out.join(" \n"));
});