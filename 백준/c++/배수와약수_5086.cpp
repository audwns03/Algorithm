#include <iostream>
using namespace std;

int main()
{
    int a,b;

    while(1) {
        cin >> a >> b;
        if(a==b) break;

        if(a>b && a%b==0) {
            cout << "multiple" << '\n';
        }
        else if(a<b && b%a==0){
            cout << "factor" << '\n';
        }
        else cout << "neither" << '\n';
    }

    return 0;
}