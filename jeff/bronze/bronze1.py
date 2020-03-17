def solution():

    start_num = int(input())
    
    result_num = start_num
    count = 0
    tens_seats = 0
    ones_seats = 0

    while tens_seats+ones_seats != result_num:
        tens_seats =  (start_num % 10) * 10
        ones_seats = ((start_num//10)+(start_num%10))%10
        start_num = tens_seats+ones_seats    
        count += 1

    print(count)
solution()
    