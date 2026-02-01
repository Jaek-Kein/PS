const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {

    const[a,b] = input[0].split(" ").map(Number);

    const r1 = (a-1) % 4;
    const c1 = Math.floor((a-1) /4);

    const r2 = ((b-1) %4);
    const c2 = Math.floor((b-1) /4);

    const distance = Math.abs(r1-r2) + Math.abs(c1-c2);
    console.log(distance)

});