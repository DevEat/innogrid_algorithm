import sys


num = int(sys.stdin.readline().strip())


step_num = [[0,0,0,0,0,0,0,0,0,0] for i in range(num+1)]

for i in range(1,10):
    step_num[1][i] = 1


for i in range(2,num+1):
    for j in range(10):
        
        if j > 0 :
            step_num[i][j] +=  step_num[i-1][j-1]
        if j < 9:
            step_num[i][j] +=  step_num[i-1][j+1]
       
    
print(sum(step_num[num]) % 1000000000 )