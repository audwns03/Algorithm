#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int arr[10001] = {0};
    int n,input,cnt = 0,now=1;
    cin >> n;

    for(int i=0;i<n;i++) {
        cin >> input;
        arr[input]++;
    }

    while(1) {
        if(cnt==n) break;

        for(int i=0;i<arr[now];i++) {
            cout << now << '\n';
            cnt++;
        }

        now++;
    }

    return 0;
}