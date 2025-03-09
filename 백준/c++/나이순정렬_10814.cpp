#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
using namespace std;

struct Node {int age; string name; int order; };
bool compare(Node a,Node b) {
    if(a.age == b.age) {
        return a.order < b.order;
    }
    else return a.age < b.age;
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    vector<Node> v;
    int n;
    cin >> n;

    for(int i=0;i<n;i++) {
        Node temp;
        cin >> temp.age >> temp.name;
        temp.order = i;
        v.push_back(temp);
    }

    sort(v.begin(),v.end(),compare);

    for(int i=0;i<v.size();i++) {
        cout << v[i].age << ' ' << v[i].name << '\n';
    }
    
    return 0;
}