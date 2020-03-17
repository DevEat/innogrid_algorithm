def solution():
    num1,num2= raw_input().split(" ");
    num1 = int(num1)
    num2 = int(num2)

    def gcd(a,b):
        if a>=b:
            return (b if  a%b==0 else gcd(b,a%b))
        else:
            return (a if  b%a==0 else gcd(a,b%a))

    gcd_of_A_and_b = gcd(num1,num2)

    print(gcd_of_A_and_b)
    print( (num1/gcd_of_A_and_b)   *(num2/gcd_of_A_and_b) * gcd_of_A_and_b)

solution()