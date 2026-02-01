const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {
    const out = [];
    let answer = 0;
    const numArr = input.map(Number);
    const sum = numArr.reduce((a,b) => a+b);

    out.push(Math.floor(sum/60));
    out.push(sum%60);
    console.log(out.join("\n"));

});