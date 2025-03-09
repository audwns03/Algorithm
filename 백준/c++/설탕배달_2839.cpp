#include <iostream>
using namespace std;

int input,check = 0;
int arr[2] = {5,3};
void run(int now,int cnt) {
    if(now >= input) {
        if(now==input && check == 0) {
            cout << cnt << '\n';
            check = 1;
        }
        return;
    }

    for(int i=0;i<2;i++) {
        if(now+arr[i] > input) continue;
        run(now+arr[i],cnt+1);
        if(check ==1) return;
    }
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin >> input;

    run(0,0);
    if(check == 0) cout << -1 << '\n';

    return 0;
}