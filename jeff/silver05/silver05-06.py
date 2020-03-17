from queue import deque
def solution():

    q = deque()
    length, nth = str(input()).split(" ")

    for i in range (1, int(length)+1):
        q.appendleft(i)
   
    
    

    print("<", end="")
    while  len(q) != 0:
        for i in range(int(nth)-1):
            temp = q.pop()
            q.appendleft(temp)
        if len(q)  >1:
            print(str(q.pop())+","  ,end=" ")
        else:
            print(str(q.pop())  , end="")
    print(">")
solution()
