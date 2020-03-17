#include<iostream>
#include <map>
#include <cstring>

using namespace std;

int main()
{
    bool flag = true;
    int N = 0;
    int group = 0;
    char word[100];
    map<char, int> alphabet;

    for(int i=0; i<26; i++)
    {
        alphabet.insert(make_pair(char(97+i), 0));
    }

    cin >> N;
    for(int i=0; i<N; i++)
    {
        flag = true;
        for(int i=0; i<26; i++)
        {
            alphabet[char(97+i)] = 0;
        }

        cin >> word;
        alphabet[word[0]]++;
        for(int j=1; j<strlen(word); j++)
        {
            if(word[j] != word[j-1] && 0 != alphabet[word[j]])
            {
                flag = false;
                break;
            }

            alphabet[word[j]]++;
        }

        if(flag == true)
        {
            group++;
        }
    }

    cout << group << endl;

    return 0;
}