def solution():
    def function(body,bodies):
        count = 1
        for each_body in bodies:
            if each_body[0] > body[0] and each_body[1] > body[1]:
                
                count +=1
        return count

    bodies = []
    for i in range(int(input())):
        weight , height = str(input()).split(" ")
        bodies.append([int(weight),int(height)])

    result = list(map(lambda x: function(x,bodies),bodies))

    for i in range(len(result)):
        if i == len(result)-1:
            print(result[i])
        else:
            print(result[i],end = " ")

solution()
