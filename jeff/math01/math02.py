
def solution():

    suger =  int(input())
    num_of_5kg = 0
    num_of_3kg = 0
    result = 0
    remainSuger = 0

    for i in range(suger//5,-1,-1):
        num_of_5kg = i
        remainSuger  = suger - (i*5)
        if remainSuger%3 == 0:
            break

    num_of_3kg = remainSuger//3

    if ( num_of_3kg  == 0 and num_of_5kg == 0)  or ( (num_of_3kg *3) + (num_of_5kg*5) < suger ):
        result = -1
    else:
        result = num_of_3kg + num_of_5kg
    print(result)
solution()
