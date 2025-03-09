#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
    vector<int> arr;
    string n,m;
    cin >> n >> m;

    int a = n.size()-1;
    int b = m.size()-1;
    int temp = 0;
    while(1) {
        if(a<0 && b <0 && temp ==0) break;

        int num_a = n[a]-'0';
        int num_b = m[b]-'0';
        if(a<0) num_a = 0;
        if(b<0) num_b = 0;

        if(num_a+num_b +temp>= 10) {
            arr.push_back(num_a + num_b - 10 + temp);
            temp=1;
        }
        else {
            arr.push_back(num_a + num_b + temp);
            temp = 0;
        }

        a--;
        b--;
    }
    
    for(int i=arr.size()-1;i>=0;i--) {
        cout << arr[i];
    }
    return 0;
}