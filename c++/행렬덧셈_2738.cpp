#include <iostream>
using namespace std;

int main()
{
    int arr[101][101] = {0},input;
    int n,m;
    cin >> n >> m;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> arr[i][j];
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> input;
            arr[i][j] += input;
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) cout << arr[i][j] << ' ';
        cout << '\n';
    }
    return 0;
}