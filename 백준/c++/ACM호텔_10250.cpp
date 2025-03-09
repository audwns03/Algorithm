#include <iostream>
using namespace std;

int main()
{
    int input;
    int h,w,n;
    cin >> input;

    for(int i=0;i<input;i++) {
        cin >> h >> w >> n;
        int cnt = 0,check = 0;
        for(int j=1;j<=w;j++) {
            for(int k=1;k<=h;k++) {
                cnt++;
                if(cnt==n) {
                    check = 1;
                    if(j<10) cout << k << '0' << j << '\n';
                    else cout << k << j << '\n';
                    break;
                }
            }
            if(check == 1) break;
        }
    }

    return 0;
}