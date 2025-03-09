#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool compare(string a,string b) {
    if(a.length() == b.length()) {
        return a < b;
    }
    else return a.length() < b.length();
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<string> v;
    string str;
    int n;
    cin >> n;

    for(int i=0;i<n;i++) {
        cin >> str;
        v.push_back(str);
    }
    sort(v.begin(),v.end(),compare);

    for(int i=0;i<v.size();i++) {
        if(i!=0 && v[i] == v[i-1]) continue;
        cout << v[i] << '\n';
    }

    return 0;
}