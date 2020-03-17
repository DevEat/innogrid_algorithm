import collections

def solution():  #952ms
    for i in range(int(input())):
        temp_list = str(input()).split(" ")
        result_string = ""
        for word in temp_list:
            stack = []
            reversed_word = ""
            for c in word:
                stack.append(c)
            while stack:
                reversed_word+=stack.pop()
            result_string += reversed_word
            result_string += " "
        print(result_string)
solution()

def solution1():  #952ms

    for i in range(int(input())):
        temp_list = str(input()).split(" ")
        result_string = ""
        for word in temp_list:
            stack = collections.deque()
            reversed_word = ""
            for c in word:
                stack.append(c)
            while stack:
                reversed_word+=stack.pop()
            result_string += reversed_word
            result_string += " "
        print(result_string)
solution1()