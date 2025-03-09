#include <iostream>
using namespace std;

int main()
{
    int arr[101][101] = {0},cnt = 0;
    int n,x,y;

    cin >> n;
    for(int i=0;i<n;i++) {
        cin >> x >> y;

        for(int i=y;i<y+10;i++) {
            for(int j=x;j<x+10;j++) {
                if(arr[i][j] !=1) {
                    cnt++;
                    arr[i][j] = 1;
                }
            }
        }
    }

    cout << cnt << '\n';
    return 0;
}