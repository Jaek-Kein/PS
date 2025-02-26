t= int(input())

for trial in range(t):
    a, b, c, d, e, f, g, h = list(map(int, input().split()))
    hp = a + e
    mp = b + f
    atk = c + g
    defe = d + h
    if hp < 1 :
        hp = 1
    if mp< 1 :
        mp = 1
    if atk < 1:
        atk = 0
    rate = 1*hp + 5*mp + 2*atk + 2*defe
    print(rate)
