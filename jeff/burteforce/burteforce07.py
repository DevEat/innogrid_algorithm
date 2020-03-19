import sys
from itertools import permutations


x,y = map(int , sys.stdin.readline().strip("").split(" "))

subList = [str(x) for x in range(1,x+1)]

target = list( map(list ,permutations(subList,y)))

for i in target:
    string = " ".join(i)
    print(string)