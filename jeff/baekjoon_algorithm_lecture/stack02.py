
import collections  # 76ms
def solution():
    def check(target_string):
        psStringStack = collections.deque()
        for character in target_string:
            if character == "(":
                psStringStack.append(character)
            else:
                if not psStringStack:
                    return False
                else:
                    psStringStack.pop()

        if not psStringStack:
            return True
        else:
            return False
        

    for i in range(int(input())):
        temp_string = input()
        if check(temp_string):
            print("YES")
        else:
            print("NO")
solution()

    
