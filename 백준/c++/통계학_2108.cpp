#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<int> v,often_v;
int arr[4001][2] = {0};
int n,input;
int avg = 0,often=0,ma = -21e8,mi = 21e8;
void run_avg() {
    for(int i=0;i<n;i++) {
        cin >> input;
        v.push_back(input);
        avg+=input;
        if(input>ma) ma = input;
        if(input<mi) mi = input;
    }

    int temp = avg%n;
    temp *=10;
    if(temp/n > 4 && avg>0) cout << avg/n+1 << '\n';
    else if(avg<0 && temp/n < -4) cout << avg/n-1 << '\n';
    else cout << avg/n << '\n';
}

void run_mid() {
    sort(v.begin(),v.end());
    cout << v[n/2] << '\n';
}
void run_often() {
    for(int i=0;i<n;i++) {
        if(v[i]>=0) {
            arr[v[i]][0]++;
            if(arr[v[i]][0] > often) often = arr[v[i]][0];
        }
        else {
            arr[-v[i]][1]++;
            if(arr[-v[i]][1] > often) often = arr[-v[i]][1];
        }
    }

    for(int i=mi;i<=ma;i++) {
        if(i<0) {
            if(arr[-i][1] == often) often_v.push_back(i);
        }
        else {
            if(arr[i][0] == often) often_v.push_back(i);
        }
    }

    if(often_v.size() >1) {
        sort(often_v.begin(),often_v.end());
        cout << often_v[1] << '\n';
    }
    else cout << often_v[0] << '\n';
}

void run_range() {
    if(ma-mi<0)cout << -(ma-mi) << '\n';
    else cout << ma-mi << '\n';
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> n;

    run_avg();
    run_mid();
    run_often();
    run_range();
    return 0;
}