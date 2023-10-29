#include <stdio.h>
#include <time.h>

int main(){
    double a = 3.1415926; 
    double b = 2.718;
    printf("%s", "Speed test ran C!\n");
    float start = clock();
    for(int i = 0; i < 100000000; i++){
        a+=b;
    }
    float end = clock();
    printf("%s%.3f%s\n","C: ", (end-start),"ms");
    int data = (int)a;
    printf("%d", data);
    return 0;
}