#include <iostream>
using namespace std;

int main()
{
    int n,m;
    int cnt = 0;
    cin >> n >> m;
    for(int i=1;i<=n;i++) {
        if(n%i==0) cnt++;

        if(cnt==m) {
            cout << i << '\n';
            return 0;
        }
    }

    cout << '0' << '\n';
    return 0;
}