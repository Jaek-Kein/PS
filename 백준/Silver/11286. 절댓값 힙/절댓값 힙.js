const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
})

const input = [];

rl.on('line', (line) => {
    input.push(line.trim()); //입력 받기
}).on('close', () => {
    const commands = Number(input[0]);

    const heap = [] //힙에어리어
    const out = [] //출력 에어리어

    const PriorityVerifier = (a, b) => { //절댓값때문에 비교 두번따로 1. 절댓값크기 2. 실제크기
        const absA = Math.abs(a);
        const absB = Math.abs(b);
        if (absA !== absB) return absA < absB;
        return a < b
    }

    const swap = (i, j) =>  {  //힙정리를 위한 교환 func
        const temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    const push = (x) => { //push 영역
        heap.push(x);
        let i = heap.length - 1;

        while (i > 0) {
            const p = (i-1) >> 1;
            if(PriorityVerifier(heap[p], heap[i])) break; //교환 필요 없으면 이동
            swap(p,i);
            i = p;
        }
    }

    const pop = () => { //pop 영역
        if (heap.length === 0) return 0; //비어있으면 return 

        const top = heap[0];
        const last = heap.pop();

        if (heap.length > 0){
            heap[0] = last;
            let i = 0;

            while(true){
                const l = i*2+1 
                const r = l+1 //n+1방식
                let largest = i;

                if (l < heap.length && PriorityVerifier(heap[l], heap[largest])) largest = l //left subtree
                if (r < heap.length && PriorityVerifier(heap[r], heap[largest])) largest = r //right subtree

                if (largest === i) break;
                swap(i, largest);
                i = largest;
            }
        }
        return top;
    }

        for (let i = 1; i <= commands; i++) {
        const x = Number(input[i]);
        if (x === 0) out.push(String(pop()));
        else push(x);
    }

    console.log(out.join("\n"));
})