
def solution():

    coord_list  = []
    for i in range(int(input())):
        coord_list.append(list(map(int, input().split())))

    
    coord_list= sorted(coord_list,key=lambda x:(x[0],x[1] ))
   
    for p in coord_list:
        print(p[0],p[1])

solution()
