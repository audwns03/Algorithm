#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int arr[5];
    int cnt = 0;

    for(int i=0;i<5;i++) {
        cin >> arr[i];
        cnt+=arr[i];
    }
    sort(arr,arr+5);

    cout <<  cnt/5 << '\n' << arr[2] << '\n';
    return 0;
}