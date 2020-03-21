//
// Created by asia_ on 2020-03-21.
//
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int N;
    int permutations[8] = {0,};

    cin >> N;
    for(int i=0; i<N; i++) {
        permutations[i] = i+1;
    }

    do{
        for(int i=0; i<N; i++) {
            cout << permutations[i] << " ";
        }
        cout << "\n";

    }while(next_permutation(permutations, permutations+N));

    return 0;
}