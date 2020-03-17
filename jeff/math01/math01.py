a,b,c= raw_input().split(" ")

a = int(a)
b = int(b)
c = int(c)
result = -1

if  c <= b :
    resul = -1
else:
    result = a// (c-b)
    result +=1
    
print( result)