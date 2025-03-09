#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    vector<int> v;
    int n,input;
    cin >> n;

    for(int i=0;i<n;i++) {
        cin >> input;
        v.push_back(input);
    }

    sort(v.begin(),v.end());
    for(int i=0;i<n;i++) {
        cout << v[i] << '\n';
    }

    return 0;
}