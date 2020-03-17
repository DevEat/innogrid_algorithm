import sys



len_of_row , len_of_col =  list(map(int, sys.stdin.readline().strip().split(" ") ))

board = []

for i in range(len_of_row):
    for character in sys.stdin.readline().strip():
        if character == "W":
            board.append(1)
        else:
            board.append(0)


def check_board(start_value,len_of_col,index_of_start,board):

    count = 0
    start = start_value

    for i in range(8):
        for j in  range(8):
            if j%8 != 7:
                if board[i*len_of_col+j+index_of_start ] != start:
                    count += 1
                start = not start
               
                
            else:

                if board[i*len_of_col+j+index_of_start ] != start:
                
                    count += 1
        
    return count

min_change = 64

for i in range(len_of_col-7):
    
    for j in range(len_of_row-7):
        
        temp_min_of_zero = check_board(True,len_of_col,(j*len_of_col+i),board)
        temp_min_of_one = check_board(False,len_of_col,(j*len_of_col+i),board)
        temp_min = temp_min_of_zero if temp_min_of_zero<temp_min_of_one else temp_min_of_one 
    
        min_change = temp_min if temp_min < min_change else min_change
print(min_change)
