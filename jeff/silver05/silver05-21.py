import sys
num_list = []
for i in range ( int(sys.stdin.readline().strip())):
    x,y = list(map(int, sys.stdin.readline().strip().split(" ")))
    num_list.append([x,y])


area = [ [[1] for j in range(100)] for i in range(100)]


for  num in num_list:
    for i in range(num[0],num[0]+10):
        for j in range(num[1],num[1]+10):
            area[i][j] = 1

result = sum(line.count(1) for line in area)

print(result)



# for i in range(100):
#     for j in range(100):
#         if area[i][]