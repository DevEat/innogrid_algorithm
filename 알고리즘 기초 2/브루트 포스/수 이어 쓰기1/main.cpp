//
// Created by asia_ on 2020-03-18.
//

#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int N;
    int digits = 1;
    int nod = 0;

    cin >> N;
    while(digits <= N) {
        nod += (N-digits+1);
        digits *= 10;
    }

    cout << nod;

    return 0;
}