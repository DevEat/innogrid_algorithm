import sys


num = int(sys.stdin.readline().strip())

num_list = [0 for i in range(num+2)]

def solution(target):

    for i in range(target+1):
        if i <= 2:
            num_list[i] = i
        else:
            num_list[i] = num_list[i-1]+num_list[i-2]

    return num_list[target]

print(solution(num)%10007)

