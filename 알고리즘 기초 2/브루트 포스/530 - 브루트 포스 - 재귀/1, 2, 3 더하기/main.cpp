//
// Created by asia_ on 2020-03-22.
//
#include <iostream>
#include <algorithm>
using namespace std;

int go(int sum, int goal) {

    if(sum > goal) return 0; // 불가능한 경우
    if(sum == goal) return 1; // 정답을 찾은 경우

    int now = 0;
    for (int i=1; i<=3; i++) {
        now += go(sum+i, goal);
    }

    return now;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int T, N;

    cin >> T;
    while(T--) {
        cin >> N;
        cout << go(0, N) << "\n";
    }

    return 0;
}
