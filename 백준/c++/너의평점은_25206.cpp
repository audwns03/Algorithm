#include <iostream>
#include <string>
using namespace std;

int main()
{
    string str,m;
    double n,cnt = 0,total = 0;
    for(int i=0;i<20;i++) {
        cin >> str >> n >> m;

        if(m=="A+") {
            total += n*4.5;
        }
        else if(m=="A0") {
            total += n*4;
        }
        else if(m=="B+") {
        }
        else if(m=="B0") {
            total += n*3;
        }
        else if(m=="C+") {
            total += n*2.5;
        }
        else if(m=="C0") {
            total += n*2;
        }
        else if(m=="D+") {
            total += n*1.5;
        }
        else if(m=="D0") {
            total += n;
        }
        else if(m=="F") {
            total += n*0;
        }
        else continue;
        cnt +=n;
    }

    if(total==0 && cnt ==0) cout << '0' << endl;
    else printf("%f",total/cnt);
    return 0;
}