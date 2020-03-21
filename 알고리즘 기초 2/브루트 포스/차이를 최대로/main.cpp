//
// Created by asia_ on 2020-03-21.
//
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;

    vector<int> permutations(N);
    for (int i = 0; i < N; i++) {
        cin >> permutations[i];
    }
    sort(permutations.begin(), permutations.end());

    int result = 0;
    do {
        int now = 0;
        for (int i = 0; i < permutations.size() - 1; i++) {
            now += abs(permutations[i] - permutations[i + 1]);
        }

        result = max(result, now);
    } while (next_permutation(permutations.begin(), permutations.end()));

    cout << result;

    return 0;
}