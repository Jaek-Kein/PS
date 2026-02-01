const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {
    let answer = 0;

    const leaderBoard = new Map();
    leaderBoard.set("1", [12, 1600])
    leaderBoard.set("2", [11, 894])
    leaderBoard.set("3", [11, 1327])
    leaderBoard.set("4", [10, 1311])
    leaderBoard.set("5", [9, 1004])
    leaderBoard.set("6", [9, 1178])
    leaderBoard.set("7", [9, 1357])
    leaderBoard.set("8", [8, 837])
    leaderBoard.set("9", [7, 1055])
    leaderBoard.set("10", [6, 556])
    leaderBoard.set("11", [6, 773])

    console.log(leaderBoard.get(input[0])[0] + " " + leaderBoard.get(input[0])[1])

});