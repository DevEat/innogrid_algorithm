def solution():
    name_list = []
    for i in range(int(input())):
        age,name = input().split(" ")
        name_list.append([int(age),name])

    name_list = sorted(name_list,key= lambda x : x[0])
    for name in name_list:
        print(str(name[0])+" "+name[1])

solution()