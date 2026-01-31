const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {
    const out = [];
    let count = 0;

    const [n,m] = input[0].split(" ").map(Number);
    const set = new Set();
    const quiz = input.slice(n+1, n+m+1);

    for (let i = 1; i <=n ; i++){
        set.add(input[i])
    }

    for( let i of quiz) {
    count = set.has(i) ? (count+1) : count ;

    }
    console.log(count);
});