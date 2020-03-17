def solutuon():
    a1, a2, a3 = str(input()).split(" ")

    n1,n2,n3 = 532,285,420
    s1 , s2 ,s3 = 13,17,10

    result = (int(a1)*n1*s1 + int(a2)*n2*s2 + int(a3)*n3*s3) %7980

    if result == 0:
        print(7980)
    else:
        print(result)


solutuon()
