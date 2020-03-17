import sys

targetChannel = int(input())
brokenNum = int(sys.stdin.readline().strip())
brokenButton = list(map(int , sys.stdin.readline().strip("").split(" ")))

def possible(num):

    for ch in str(num):
        if int(ch) in brokenButton:
            return False

    return True

minNum = abs(targetChannel-100)

for i in range(1000001):
    if possible(i):
        tempMin  = len(str(i)) + abs(targetChannel-i)  
        minNum = tempMin if tempMin < minNum else minNum
        
print(minNum)