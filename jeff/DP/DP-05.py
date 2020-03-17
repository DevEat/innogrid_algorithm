import sys


num = int(sys.stdin.readline().strip())
card_list =  list(map(int ,sys.stdin.readline().strip().split(" ")))



def solution(num):
    min_price = [ 10000000 for i in range(num+1)]

    min_price[0] = 0
    
    for i in range(1,num+1):
        for j in range(1,i+1):
            min_price[i] =  min(min_price[i], min_price[i-j]+card_list[j-1])

    print(min_price[num])
solution(num)