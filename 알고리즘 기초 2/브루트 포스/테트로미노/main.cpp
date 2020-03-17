//
// Created by asia_ on 2020-03-16.
//
#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int N, M;
    int block[501][501] = {0,};
    int max = 0;

    cin >> N >> M;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cin >> block[i][j];
        }
    }

    // 4
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M - 3; j++) {
            max = (max < block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i][j + 3]) ?
                  block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i][j + 3] : max;
        }
    }

    // 3 1
    for (int i = 0; i < N - 1; i++) {
        for (int j = 0; j < M - 2; j++) {
            max = (max < block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i + 1][j]) ?
                  block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i + 1][j] : max;

            max = (max < block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i + 1][j + 1]) ?
                  block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i + 1][j + 1] : max;

            max = (max < block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i + 1][j + 2]) ?
                  block[i][j] + block[i][j + 1] + block[i][j + 2] + block[i + 1][j + 2] : max;
        }
    }

    // 2 2
    for (int i = 0; i < N - 1; i++) {
        for (int j = 0; j < M - 1; j++) {
            if (0 < j) {
                max = (max < block[i][j] + block[i][j + 1] + block[i + 1][j - 1] + block[i + 1][j]) ?
                      block[i][j] + block[i][j + 1] + block[i + 1][j - 1] + block[i + 1][j] : max;
            }

            max = (max < block[i][j] + block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1]) ?
                  block[i][j] + block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1] : max;

            if (j < M - 2) {
                max = (max < block[i][j] + block[i][j + 1] + block[i + 1][j + 1] + block[i + 1][j + 2]) ?
                      block[i][j] + block[i][j + 1] + block[i + 1][j + 1] + block[i + 1][j + 2] : max;
            }

        }
    }

    // 1 3
    for (int i = 0; i < N - 1; i++) {
        for (int j = 0; j < M - 2; j++) {
            max = (max < block[i][j] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 1][j + 2]) ?
                  block[i][j] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 1][j + 2] : max;

            max = (max < block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 1][j + 2]) ?
                  block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 1][j + 2] : max;

            max = (max < block[i][j + 2] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 1][j + 2]) ?
                  block[i][j + 2] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 1][j + 2] : max;
        }
    }

    // 2 1 1
    for (int i = 0; i < N - 2; i++) {
        for (int j = 0; j < M - 1; j++) {
            max = (max < block[i][j] + block[i][j + 1] + block[i + 1][j] + block[i + 2][j]) ?
                  block[i][j] + block[i][j + 1] + block[i + 1][j] + block[i + 2][j] : max;

            max = (max < block[i][j] + block[i][j + 1] + block[i + 1][j + 1] + block[i + 2][j + 1]) ?
                  block[i][j] + block[i][j + 1] + block[i + 1][j + 1] + block[i + 2][j + 1] : max;
        }
    }

    // 1 2 1
    for (int i = 0; i < N - 2; i++) {
        for (int j = 0; j < M - 1; j++) {
            max = (max < block[i][j] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j]) ?
                  block[i][j] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j] : max;

            max = (max < block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j + 1]) ?
                  block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j + 1] : max;

            max = (max < block[i][j] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j + 1]) ?
                  block[i][j] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j + 1] : max;

            max = (max < block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j]) ?
                  block[i][j + 1] + block[i + 1][j] + block[i + 1][j + 1] + block[i + 2][j] : max;
        }
    }

    // 1 1 2
    for (int i = 0; i < N - 2; i++) {
        for (int j = 0; j < M - 1; j++) {
            max = (max < block[i][j] + block[i + 1][j] + block[i + 2][j] + block[i + 2][j + 1]) ?
                  block[i][j] + block[i + 1][j] + block[i + 2][j] + block[i + 2][j + 1] : max;

            max = (max < block[i][j + 1] + block[i + 1][j + 1] + block[i + 2][j] + block[i + 2][j + 1]) ?
                  block[i][j + 1] + block[i + 1][j + 1] + block[i + 2][j] + block[i + 2][j + 1] : max;
        }
    }

    // 1 1 1 1
    for (int i = 0; i < N - 3; i++) {
        for (int j = 0; j < M; j++) {
            max = (max < block[i][j] + block[i + 1][j] + block[i + 2][j] + block[i + 3][j]) ?
                  block[i][j] + block[i + 1][j] + block[i + 2][j] + block[i + 3][j] : max;
        }
    }

    cout << max;

    return 0;
}