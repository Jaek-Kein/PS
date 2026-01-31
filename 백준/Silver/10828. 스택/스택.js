const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim());
}).on("close", () => {
    const lines = Number(input[0]);
    const stack = [];
    const out = [];

    for (let i = 1; i <= lines; i++) {
        const [command, argument] = input[i].split(" ");

        if (command === "push") {
            stack.push(argument);
        } else if (command === "pop") {
            out.push(stack.length ? stack.pop() : -1);
        } else if (command === "size") {
            out.push(stack.length);
        } else if (command === "empty") {
            out.push(stack.length ? 0 : 1);
        } else if (command === "top") {
            out.push(stack.length ? stack[stack.length -1] : -1);
        }
    }

    console.log(out.join("\n"));
});
