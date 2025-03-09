#include <iostream>
#include <string>
using namespace std;

int main()
{
    string arr[5];
    int max = 0;
    for(int i=0;i<5;i++) {
        cin >> arr[i];
        if(arr[i].length()>max) max = arr[i].length();
    }

    for(int i=0;i<max;i++) {
        for(int j=0;j<5;j++) {
            if(arr[j].length()-1<i) continue;
            cout << arr[j][i];
        }
    }

    return 0;
}