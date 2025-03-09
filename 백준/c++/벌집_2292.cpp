#include <iostream>
using namespace std;

int main()
{
    int n,cnt = 1,now = 0;
    cin >>n;


    while(now+1<n) {
        
        now += cnt*6;
        cnt++;
    }

    cout << cnt << '\n';
    return 0;
}