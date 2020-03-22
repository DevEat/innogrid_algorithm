//
// Created by asia_ on 2020-03-22.
//
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

bool check(string &password) {

    int ja = 0;
    int mo = 0;
    for (char x : password) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            mo += 1;
        } else {
            ja += 1;
        }
    }

    return 2 <= ja && 1 <= mo;
}

void go(int n, vector<char> alpha, string password, int i) {
    if (password.length() == n) { // 조건 만족 o
        if (check(password)) {
            cout << password << "\n";
        }
        return;
    }

    if (i >= alpha.size()) return; // 조건 만족 x
    go(n, alpha, password + alpha[i], i + 1); // i 선택 o
    go(n, alpha, password, i + 1); // i 선택 x
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int L, C;
    cin >> L >> C;

    vector<char> alpha(C);
    for (int i = 0; i < C; i++) {
        cin >> alpha[i];
    }

    sort(alpha.begin(), alpha.end());
    go(L, alpha, "", 0);

    return 0;
}
