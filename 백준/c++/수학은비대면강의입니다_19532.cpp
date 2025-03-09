#include <iostream>
using namespace std;

int main()
{
    int a[3],b[3];
    for(int i=0;i<3;i++) cin >> a[i];
    for(int i=0;i<3;i++) cin >> b[i];

    for(int i=-999;i<=999;i++) {
        for(int j=-999;j<=999;j++) {
            if((a[0]*i + a[1]*j) == a[2] && (b[0]*i + b[1]*j) == b[2]) {
                cout << i << ' ' << j << '\n';
                return 0;
            }
        }
    }

    return 0;
}