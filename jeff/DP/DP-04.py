import sys


num = int(sys.stdin.readline().strip())
card_list =  list(map(int ,sys.stdin.readline().strip().split(" ")))



def solution(num):
    max_price = [ 0 for i in range(num+1)]

    
    for i in range(1,num+1):
        for j in range(1,i+1):
            max_price[i] =  max(max_price[i], max_price[i-j]+card_list[j-1])

    print(max_price[num])
solution(num)