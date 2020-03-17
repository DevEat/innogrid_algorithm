from collections import Counter
import math
def solution():

    room_number = list(input())
    room_number
    count = Counter(room_number) 
    num_of_6_and_9 = math.ceil( (count['6'] + count['9'])/2)
    count['6']  = num_of_6_and_9
    count['9']  = num_of_6_and_9

    max_key = count.most_common(1)
    print(max_key[0][1])


solution()