import math

def solution():
    target = int(input())

    sqrt = int(math.sqrt(target))
    result = 0
    for i in range(sqrt+1):
        sum_of_num = 3*i*i + 3*i +1
        if sum_of_num >= target:
            result = i+1
            break
    print(result)
solution()