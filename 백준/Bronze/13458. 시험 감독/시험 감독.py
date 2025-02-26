#Question no 13458 시험감독
import sys

global judge_count
judge_count = 0

place = int(sys.stdin.readline())

if place == 1:
    tester = int(sys.stdin.readline())
else:
    tester = list(map(int, sys.stdin.readline().split()))

main, sub = map(int, sys.stdin.readline().split())

if place == 1:
    tester -= main
    judge_count += 1
    if tester > 0:
        judge_count += tester//sub
        if tester%sub != False:
            judge_count += 1
else:
    for i in tester :
        i -= main
        judge_count += 1
        if i > 0:
            judge_count += i//sub
            if i%sub != False:
                judge_count += 1
        else:
            continue

print(judge_count)
