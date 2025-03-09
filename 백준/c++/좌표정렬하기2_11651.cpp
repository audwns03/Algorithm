#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Node {
    int x,y;
};
bool compare(Node a,Node b) {
    if(a.y == b.y) {
        return a.x < b.x;
    }
    else return a.y < b.y;
}
int main()
{
    vector<Node> v;
    int n;
    cin >> n;

    for(int i=0;i<n;i++) {
        Node temp;
        cin >> temp.x >> temp.y;
        v.push_back(temp);
    }
    sort(v.begin(),v.end(),compare);

    for(int i=0;i<v.size();i++) {
        cout << v[i].x << ' ' << v[i].y << '\n';
    }

    return 0;
}