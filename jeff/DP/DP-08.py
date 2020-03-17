import sys



def solution():
    num = int(sys.stdin.readline().strip())


    num_list = [[0,0] for x in range(num+1)]


    num_list[1][0] = 0
    num_list[1][1] = 1
    
    if num <2:
        print(sum(num_list[1]))
        return

    for i in range(2,num+1):
        num_list[i][0] = num_list[i-1][0]+num_list[i-1][1]
        num_list[i][1] = num_list[i-1][0]


    print(sum(num_list[num]))
    return

solution()