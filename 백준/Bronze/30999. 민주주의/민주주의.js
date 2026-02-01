const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {
    let out = 0;

    const [n,m] = input[0].split(" ").map(Number);

    for (let i = 1 ; i <= n; i++){
        const judge = input[i];
        let count = 0;
        for(let k of judge){
            count = k === 'O' ? count+1  : count-1;
        }
        out = count < 0 ? out : out+1;
    }

    console.log(out);
});