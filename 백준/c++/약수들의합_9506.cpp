#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int input;
    
    while(1) {
        int cnt = 0;
        vector<int> v;

        cin >> input;
        if(input == -1) break;

        for(int i=1;i<input;i++) {
            if(input%i==0) {
                cnt +=i;
                v.push_back(i);
            }
        }
        if(cnt == input) {
            cout << input << " = ";
            for(int i=0;i<v.size()-1;i++) {
                cout << v[i] << " + ";
            }
            cout << v[v.size()-1] << '\n';
        }
        else {
            cout << input << " is NOT perfect." << '\n';
        }
    }

    return 0;
}