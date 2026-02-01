const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
});

const input = [];

rl.on("line", (line) => {
    input.push(line.trim()); //입력 받기
}).on("close", () => {
    let answer = 0;

    const schoolMap = new Map();
    schoolMap.set("NLCS", "North London Collegiate School")
    schoolMap.set("BHA", "Branksome Hall Asia")
    schoolMap.set("KIS", "Korea International School")
    schoolMap.set("SJA", "St. Johnsbury Academy")

    console.log(schoolMap.get(input[0]))

});