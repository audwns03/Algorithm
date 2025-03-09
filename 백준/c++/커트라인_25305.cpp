#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    vector<int> v;
    int n,m,input;
    cin >> n >> m;

    for(int i=0;i<n;i++) {
        cin >> input;
        v.push_back(input);
    }
    sort(v.begin(),v.end(),greater<int>());
    cout << v[m-1] << '\n';

    return 0;
}