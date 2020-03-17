def solution():

    input()

    num_list = input().split(" ")
    num_list = sorted(num_list,key= lambda x : int(x))
    print( int(num_list[0])  *int(num_list[len(num_list)-1 ])   )
solution()