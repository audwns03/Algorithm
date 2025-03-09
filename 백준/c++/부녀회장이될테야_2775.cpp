#include <iostream>
using namespace std;

int main()
{
    int arr[15][15] = {0};
    int input,k,n;
    for(int i=0;i<15;i++) arr[0][i] = i;

    cin >> input;
    for(int i=0;i<input;i++) {
        cin >> k >> n;
        if(arr[k][n]!=0) {
            cout << arr[k][n] << '\n';
            continue;
        }

        for(int j=1;j<=k;j++) {
            for(int l=1;l<=n;l++) {
                if(arr[j][l] !=0) continue;
                for(int u=1;u<=l;u++) {
                    arr[j][l] +=arr[j-1][u];
                }
            }
        }
        cout << arr[k][n] << '\n';
    }

    return 0;
}