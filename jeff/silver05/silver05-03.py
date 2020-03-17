def solution():

    fib_num = int(raw_input())
    
    if fib_num <= 1:
        print(fib_num)
        return
    
    fib_num_list = [0,1]
    for i in range(2,fib_num+1):
        fib_num_list.append(fib_num_list[i-2]+fib_num_list[i-1])

    print(fib_num_list[fib_num])

solution()

