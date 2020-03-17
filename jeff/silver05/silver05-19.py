import sys
def solution():
    num = sys.stdin.readline().strip()
    sum = 0
    for n in num:
        sum += int(n)

    if sum %3 != 0 or not("0" in num):
        print(-1)
        return
   
    num = sorted(num,key=lambda x: -(int(x)))

    result = "".join(num)
    print(result)

solution()
    


