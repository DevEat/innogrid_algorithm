import sys


operator = set()


for i in range ( int(sys.stdin.readline().strip())):
    op,num = sys.stdin.readline().strip().split(" ")
    num = int(num)
    if op == "add" :
        operator.add(num)
    if op == "remove" :
        if num in operator :
            operator.remove(num)
    if op == "check":
        print(1 if num in operator else 0)
    if op == "toggle":
        operator.add(num) if not num in operator else operator.remove(num)
    if op == "all":
        operator.clear()
        for i in range(1,21):
            operator.add(i)
    if op ==  "empty":
        operator.clear()