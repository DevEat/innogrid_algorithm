//
// Created by asia_ on 2020-03-21.
//
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int N;
    int permutations[10000] = {0,};

    cin >> N;
    for(int i=0;i <N; i++) {
        cin >> permutations[i];
    }

    bool result = next_permutation(permutations, permutations+N);
    if(!result) {
        cout << "-1";
    } else if(result) {
        for (int i = 0; i < N; i++) {
            cout << permutations[i] << " ";
        }
    }

    return 0;
}