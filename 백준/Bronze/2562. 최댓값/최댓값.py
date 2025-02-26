list1 = []
for a in range(9):
    num = int(input())
    list1.append(num)

dictio= {string : i for i,string in enumerate(list1)}
list1.sort()

p = list1[-1]
print(p)
print(dictio[p]+1)
