

def solution():
    word_list = set()
    for i in range(int(input())):
        word_list.add(input())

    word_list = list(word_list)
    word_list.sort()
    word_list = sorted(word_list,key=len)


    for word in word_list:
        print(word)

solution()


bosh alias-env bosh -e 130.0.0.73 --ca-cert <(bosh int creds.yml --path /director_ssl/ca)
Using environment '192.168.1.214' as client 'admin'