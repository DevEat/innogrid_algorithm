def solution():

    def check_group_work(target_wrold):
        char_list=[]
        before_char=''
        for char in target_wrold:
            if char in char_list and before_char!=char:
                return False
            if char!=before_char:
                char_list.append(char)
            before_char = char
        return True
            

    word_count = int(raw_input())
    result = 0
    for i in range(word_count):
        word = raw_input()
        print(sorted(word,key=word.find))
        if check_group_work(word) == True:
            result+=1
    print(result)


solution()
