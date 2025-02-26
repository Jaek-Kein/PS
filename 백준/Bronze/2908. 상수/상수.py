a, b = map(int, input().split())

a1 = (a%10) * 100
a = int(a /10)
a2 = (a%10) *10
a = int(a/10)
a3 = (a%10)
an = a1 +a2 +a3

b1 = (b%10) * 100
b = int(b/10)
b2 = (b%10) *10
b = int(b/10)
b3 = (b%10)
bn = b1 + b2 + b3

if an > bn :
    print (an)
else :
    print(bn)
