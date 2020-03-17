def solution():

    def factorial(n):
        result = 1
        for i in range(1,n+1):
            result *= i
            
        return result

    for i in range(int(input())):
        left, right = str(input()).split(" ")
        if int(left) == int(right):
            print(1)
            continue
        
        n_factorial = factorial(int(right))
        r_factorial = factorial(int(left))
        n_minus_r_factorial  =  factorial(int(right)-int(left))
        print(n_factorial//(r_factorial)//n_minus_r_factorial )

    

solution()
