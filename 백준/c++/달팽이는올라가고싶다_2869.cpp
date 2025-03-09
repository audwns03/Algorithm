#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int a,b,v,cnt = 0;
    cin >> a >> b >> v;

    cnt = v-a;
    if(cnt%(a-b)==0) cout << cnt/(a-b)+1 << '\n';
    else cout << cnt/(a-b)+2 << '\n';
    return 0;
}