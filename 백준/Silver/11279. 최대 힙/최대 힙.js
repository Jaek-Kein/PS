const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim());
}).on("close", () => {
    const commands = Number(input[0]);

    const heap = [];
    const out = [];

    const swap = (i, j) => {
        const temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    };

    const push = (x) => {
        heap.push(x);
        let i = heap.length - 1;

        while (i > 0) {
            const p = (i - 1) >> 1;
            if (heap[p] >= heap[i]) break;
            swap(p, i);
            i = p;
        }
    };

    const pop = () => {
        if (heap.length === 0) {
            return 0;
        }
        const top = heap[0];
        const last = heap.pop();

        if (heap.length > 0) {
            heap[0] = last;
            let i = 0;

            while (true) {
                const l = i * 2 + 1;
                const r = l + 1;
                let largest = i;

                if (l < heap.length && heap[l] > heap[largest]) largest = l;
                if (r < heap.length && heap[r] > heap[largest]) largest = r;

                if (largest === i) break;
                swap(i, largest);
                i = largest;
            }
        }
        return top;
    };

    for (let i = 1; i <= commands; i++) {
        const x = Number(input[i]);
        if (x === 0) out.push(String(pop()));
        else push(x);
    }

    console.log(out.join(" \n"));
});
