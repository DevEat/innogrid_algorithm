//
// Created by asia_ on 2020-03-21.
//
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int N;
    int permutations[10000] = {0,};

    cin >> N;
    for(int i=0;i <N; i++) {
        cin >> permutations[i];
    }

    bool result = prev_permutation(permutations, permutations+N);
    if(!result) {
        cout << "-1";
    } else if(result) {
        for (int i = 0; i < N; i++) {
            cout << permutations[i] << " ";
        }
    }

    return 0;
}