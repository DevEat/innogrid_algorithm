#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Word
{
public:
    string w;
    int wc;

    Word(string w, int wc): w(w), wc(wc){}
};

bool compare(Word a, Word b)
{
    if(a.wc == b.wc)
    {
        return a.w < b.w;
    }
    else
    {
        return a.wc < b.wc;
    }
}

int main()
{
    int N;
    vector<Word> v;
    string w;

    cin >> N;
    for(int i=0; i<N; i++)
    {
        cin >> w;
        v.push_back(Word(w, w.length()));
    }
    
    sort(v.begin(), v.end(), compare);
    
    cout << v[0].w << "\n";
    for(int i=1; i<N; i++)
    {
        if(v[i-1].w != v[i].w)
            cout << v[i].w << "\n";
    }

    return 0;
}

