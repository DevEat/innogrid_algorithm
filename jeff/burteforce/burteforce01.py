import sys

def solution():
    num_list = []

    for i in range(9):
        num_list+= list(map(int,sys.stdin.readline().strip().split(" ")))

    sum_of_height = sum(num_list)
    num_list = sorted(num_list,key=lambda  x: x)

    for i in range(9):
        for j in range(i+1,9):
            if sum_of_height-num_list[i]-num_list[j] == 100:
                for k in range(9):
                    if k==i or k==j:
                        continue 
                    print(num_list[k])
                return

solution()



