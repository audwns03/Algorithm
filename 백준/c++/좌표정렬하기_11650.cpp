#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Node {
    int x,y;
};

bool compare(Node a,Node b) {
    if(a.x == b.x) {
        return a.y < b.y;
    }
    else {
        return a.x < b.x;
    }
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    vector<Node> v;
    int n;
    cin >> n;

    for(int i=0;i<n;i++) {
        Node input;
        cin >> input.x >> input.y;
        v.push_back(input);
    }
    sort(v.begin(),v.end(),compare);

    for(int i=0;i<n;i++) {
        cout << v[i].x << ' ' << v[i].y << '\n';
    }
    return 0;
}