import sys
boardLength = list(map(int , sys.stdin.readline().strip("").split(" ")))
board = []



def maxCheck(position):
    pass

for i in range(boardLength[0]):
    tempBoard =  list(map(int , sys.stdin.readline().strip("").split(" ")))
    board.append(tempBoard)

for li in board:
    print(li)
