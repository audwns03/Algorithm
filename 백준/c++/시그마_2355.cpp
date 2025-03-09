#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,m;
    long long int cnt = 0;
    cin >> n >> m;
    if(n>m) swap(n,m);

   cnt = (m*(m+1))/2 - (n*(n-1))/2;

    cout << cnt << '\n';
    return 0;
}