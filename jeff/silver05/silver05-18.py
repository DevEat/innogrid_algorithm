import sys

max_num , target_position =  list(map(int, sys.stdin.readline().strip().split(" ") ))

num_list = []

for num in sys.stdin.readline().strip().split(" ")  :
    num_list.append(num)
num_list = sorted(num_list,key= lambda x : x)

print(num_list[target_position-1])
    