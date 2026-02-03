const readline = require("readline");

const rl = readline.createInterface({ input: process.stdin });

const input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    let n = Number(input[0]);
    const list = input[1].split(" ").map(Number);
    list.sort((a,b) => b-a);
    let answer = 0;

    for (let i = 0; i < n; i++ ){
        
        answer = i === 0 ? answer + list[i] : answer + (list[i]/2);
    }

    console.log(answer);
});