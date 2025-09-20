function solution(numbers, target) {
    let answer = 0;
    let memo = [0];
    
    //모든 경우의 수를 완전탐색하기 BFS
    for (let num of numbers){
        let temp = []
        for (let memoed of memo){
            temp.push(memoed + num);
            temp.push(memoed - num);
        }
        memo = temp
    }
    //비교
    for (let val of memo){
        if (val === target){
            answer += 1
        }
    }
    return answer;
}