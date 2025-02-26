import sys

number = int(input())

if number == 0 :
    print(1)

else :
    fact = 1
    for i in range(1, number+1):
        fact = fact * i

    print(fact)