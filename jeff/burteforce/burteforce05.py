import sys


def getNum(m,n,x,y):
    for i in range(x,m*n+1,m):
        if  i%n == y:
            return i
    
    return  (-1)

for _ in range(int(input())):
    m,n,x,y =  map(int , sys.stdin.readline().strip("").split(" "))
    print(getNum(m,n,x,y))
