const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {
    let answer = 0;

    const way = Number(input[0]);

    answer = Math.floor(way/5);

    console.log(way%5 === 0 ? answer : answer+1)

});