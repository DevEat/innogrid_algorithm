def solution():

    alpha_string= raw_input()
    count = 0
    for i in range(len(alpha_string)):
        if alpha_string[i] == '-' :
            pass
        elif alpha_string[i] == "j" and (alpha_string[i-1] == "l" or alpha_string[i-1] == "n"):
            pass
        elif alpha_string[i] == "=" :
            if alpha_string[i-1] == "z" and  i-2 >= 0 and alpha_string[i-2] == "d":
                count -=1
        else:
            count +=1

    print(count)
solution()  