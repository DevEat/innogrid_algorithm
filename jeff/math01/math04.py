def solution():
    target = int(input())
    
    sum_of_num = 0  # n-1 번째 그룹까지의 숫자의 갯수
    before_sum_of_num = 0
    result = 0  # 몇 번째 군의 숫자인지

    for i in range(1,target):
        before_sum_of_num = sum_of_num
        sum_of_num = (i*(i+1))//2
        if sum_of_num >= target:
            result = i+1
            break    
    if (result-1)%2 == 0:
        inum = target-before_sum_of_num
        jnum = result-inum
    else:
        jnum = target-before_sum_of_num
        inum = result-jnum

    print(str(inum)+"/"+str(jnum))
solution()