import sys


num = int(sys.stdin.readline().strip())


def solution(target):

    num_list = [0 for i in range(target+1)]
    num_list[1] = 1
    num_list[2] = 2
    num_list[3] = 4
    if target <= 3:
        return num_list[target]

    for i in range(4,num+1):
        num_list[i] = num_list[i-1]+ num_list[i-2]+ num_list[i-3]
    return num_list[target]


print(solution(num))