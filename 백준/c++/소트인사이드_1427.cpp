#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    vector<int> v;
    string str;
    cin >> str;

    for(int i=0;i<str.length();i++) {
        v.push_back(str[i]-'0');
    }

    sort(v.begin(),v.end(),greater<int>());
    for(int i=0;i<v.size();i++) {
        cout << v[i];
    }
    return 0;
}