import sys

def solution():
    
    def count_max(list_):
        currnet_row_max = 1
        before_row_max = 1
        
        currnet_col_max = 1
        before_col_max = 1

        for i in range(len(list_)):
            currnet_col_max = 1
            currnet_row_max = 1
            for j in range(len(list_)-1):
                if list_[i][j]==list_[i][j+1]:
                    currnet_row_max+=1
                elif list_[i][j] !=list_[i][j+1] :
                    before_row_max = currnet_row_max if currnet_row_max>before_row_max else before_row_max
                    currnet_row_max = 1


                if list_[j][i]==list_[j+1][i]:
                    currnet_col_max+=1
                else:
                    before_col_max = currnet_col_max if currnet_col_max>before_col_max else before_col_max
                    currnet_col_max = 1

        return max([currnet_row_max,before_row_max,currnet_col_max,before_col_max])
                
    candy_list = []
    candy_count  =  int(input())
    candy_list = [[] for x in range(candy_count)]
    max_= 1

    for i in range(candy_count) :
        for ch in sys.stdin.readline().strip():
            candy_list[i].append(ch)

    for i in range(len(candy_list)) :
        for j in range(len(candy_list[0])-1):
            
            candy_list[i][j], candy_list[i][j+1] = candy_list[i][j+1],candy_list[i][j]
            changed = count_max(candy_list)
            max_ = max_ if changed < max_ else  changed
            candy_list[i][j], candy_list[i][j+1] = candy_list[i][j+1],candy_list[i][j]

            candy_list[j][i], candy_list[j+1][i] =  candy_list[j+1][i], candy_list[j][i]
            changed = count_max(candy_list)
            max_ = max_ if changed < max_ else  changed
            candy_list[j][i], candy_list[j+1][i] =  candy_list[j+1][i], candy_list[j][i]

    print(max_)

solution()
