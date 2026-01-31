const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,   
})

const input = [];

rl.on('line', (line) => {
    input.push(line.trim());
}).on('close', () => {
    const n = Number(input[0]);
    const sequence = input.slice(1).map(Number);

    const stack = [];
    const out = [];
    let next = 1;

    for (let i = 0; i < n ; i++){
        const target = sequence[i];
        
        while(next <= target) {
            stack.push(next ++);
            out.push('+');
        }

        if (stack[stack.length - 1]   === target) {
            stack.pop();
            out.push('-');
        } else {
            console.log('NO');
            return;
        }
    }

    console.log(out.join('\n'));
});