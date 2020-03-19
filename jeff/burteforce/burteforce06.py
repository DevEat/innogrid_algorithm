

rangeOfNum = int(input())
numLen = len(str(rangeOfNum))
result = 0
numCount = 1

for _ in range(1,numLen-1):

    result = result + (numCount*10)
    numCount +=1

# result += len(str(rangeOfNum)) * rangeOfNum
    


print(result)

# result = 0
# for i in range(1,rangeOfNum+1):
#     result += len(str(i))

# print(result)