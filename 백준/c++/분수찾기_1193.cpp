#include <iostream>
using namespace std;


bool run(int now,int n,int*result) {
    if(now==n) {
        cout << result[0] << '/' << result[1] << '\n';
        return 1;
    }
    else return 0;
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int now = 1, result[2] = {1,1},check=0;
    int n;
    cin >> n;

    for(;;) {
        if(run(now,n,result)) return 0;

        if(check == 0) {
            result[1]++;
            now++;
            check = 1;
        }
        else if(check == 1) {
            int temp = result[1]-1;
            for(int i=0;i<temp;i++) {
                result[0]++;
                result[1]--;
                now++;
                if(run(now,n,result)) return 0;
            }
            check = 2;
        }
        else if(check == 2) {
            result[0]++;
            now++;
            check = 3;
        }
        else if(check == 3) {
            int temp = result[0] - 1;
            for(int i=0;i<temp;i++) {
                result[0]--;
                result[1]++;
                now++;
                if(run(now,n,result)) return 0;
            }
            check = 0;
        }
    }

    return 0;
}