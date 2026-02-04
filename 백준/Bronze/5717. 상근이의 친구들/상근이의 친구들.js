const readline = require("readline");

const rl = readline.createInterface({input:process.stdin});

const input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    const out = [];
    
    for (let i = 0; i < input.length; i++){
        const [M, F] = input[i].split(" ").map(Number);
        if (M+F === 0) break;
        out.push(M+F);
    }
    
    console.log(out.join("\n"));
})