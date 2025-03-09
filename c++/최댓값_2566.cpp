#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int map[10][10] = {0};
    int max = -21e8,cord[2];

    for(int i=0;i<9;i++) {
        for(int j=0;j<9;j++) cin >> map[i][j];
    }
    for(int i=0;i<9;i++) {
        for(int j=0;j<9;j++) {
            if(map[i][j] > max) {
                max = map[i][j];
                cord[0] = i+1;
                cord[1] = j+1;
            }
        }
    }

    cout << max << '\n' << cord[0] << ' ' << cord[1] << '\n';
    return 0;
}