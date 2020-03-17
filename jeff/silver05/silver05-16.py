import sys

def solution():

    num_list = []
    for i in range(int(sys.stdin.readline())) :
        x,y = list(map(int, sys.stdin.readline().strip().split(" ") ))
        num_list.append([x,y])
    
    num_list = sorted(num_list, key =lambda  x: ( x[1], x[0]))
    for pair in num_list:
        x,y =  pair
        sys.stdout.write(str(x)+" "+str(y)+"\n")
    
solution()