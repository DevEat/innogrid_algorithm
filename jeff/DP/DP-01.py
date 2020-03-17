import sys

num = int(sys.stdin.readline().strip())

list_ = [0 for i in range(num+1)]

def min(x,y):
    return x if x >= y else y

def num_check(target):
    
    list_[1] = 0

    for i in range(2,target+1):
        
        if i == 2 or i == 3:
            list_[i] = 1
        else:
            list_[i] = list_[i-1]+1
            min = list_[i-1]
            if i %3 ==0:
                min = list_[i//3] if  list_[i//3] <= min else min
                list_[i] = min+1
            if i % 2 == 0:
                min = list_[i//2] if  list_[i//2] <= min else min
                list_[i] = min+1

    print(list_[target])
   

num_check(num)