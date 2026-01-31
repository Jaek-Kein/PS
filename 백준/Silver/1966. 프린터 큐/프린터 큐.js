const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    // n개 만큼 2줄씩 총 n*2개의 원소를 가진 2차원 배열  그러니까 n*2-1 로 m  과 target
    input.push(line.trim());
}).on("close", () => {
    const cases = Number(input[0]);
    const out = [];

    for (let i = 1; i <= cases; i++) {
        let [n, target] = input[i * 2 - 1].split(" ").map(Number); // 문서수 n , 목표문서 target 위치
        const priorities = input[i * 2].split(" ").map(Number); // 우선도 리스트

        let counts = 0; //출력 순서

        while (true) {

            if (priorities[0] === Math.max(...priorities)) {
                //만약 지금 첫번째 값이 배열의 최댓값이면
                priorities.shift(); // 그 값을 제거하고
                counts++; // 출력 횟수를 늘리고

                if (target === 0) {
                    out.push(counts);
                    break;
                } else {
                    target --;
                } //만약 출력한게 target 이면 끝내주세요
            } else {
                priorities.push(priorities.shift());
                target =  target === 0 ? (priorities.length - 1) : target-1;
            }
        }
    }

    console.log(out.join("\n"));
});