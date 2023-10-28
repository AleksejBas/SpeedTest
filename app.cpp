#include <iostream>
#include <time.h>
using namespace std;

int main(){
    double a = 3.1415926, b = 2.718;
    cout << "Speed test run C++!" << endl;
    float start = clock();
    for(int i = 1; i < 100000000; i++)
        a+=b;
    float end = clock();
    cout << "C++: " << (end-start) << "ms" << endl;
    cout << (int)a << endl;

    return 0;
}