import sys


num = int(sys.stdin.readline().strip())
num_list = list(map(int,sys.stdin.readline().strip().split(" ")))

# num_set = set(sorted(num_list,key=lambda x: x))

# print(len(num_set))
result = [[[],1,num_list[i-1]] for i in range(num+1)]

for i in range(num+1):
    for j in range(i+1):
        if num_list[i-1] > num_list[j-1] :
            result[i][1] = max(result[j][1]+1,result[i][1])
            result[i][0] = result[i][0].append(1) if result[j][1]+1 > result[i][1] else [num_list[i-1]]
            print( result[i][0],num_list[i-1],i)

print(result)
print(max(result))