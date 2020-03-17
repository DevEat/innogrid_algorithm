import sys


num = int(sys.stdin.readline().strip())
num_list = list(map(int,sys.stdin.readline().strip().split(" ")))

# num_set = set(sorted(num_list,key=lambda x: x))

# print(len(num_set))
result = [1 for i in range(num+1)]

for i in range(1,num+1):
    for j in range(1,i+1):
        if num_list[i-1] > num_list[j-1] :
            result[i] = max(result[j]+1,result[i])


print(max(result))