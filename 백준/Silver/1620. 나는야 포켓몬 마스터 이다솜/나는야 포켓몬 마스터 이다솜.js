const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
})

const input = [];

rl.on('line', (line) => {
    input.push(line.trim()); //입력 받기
}).on('close', () => {
    const [n, m] = input[0].split(" ").map(Number);
    const question = input.slice(n+1);
    const nameMap = new Map();
    const out = []

    for ( let i = 1 ; i <= n ; i++){ //string 2 int 는 map 으로 반대는 arr 그대로
        nameMap.set(input[i], i);
    }

    for(let i of question){
        if(!Number.isNaN(+i)){
            out.push(input[Number(i)]);
        } else {
            out.push(nameMap.get(i))
        }
    }

    console.log(out.join(" \n"));
})