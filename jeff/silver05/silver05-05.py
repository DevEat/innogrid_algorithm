def solution():

    input_string = input()

    num_list = list(input_string)
    num_list.sort(reverse=True)
    result = "".join(num_list)
    print(result)

solution()