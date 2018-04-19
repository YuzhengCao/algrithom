#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int a[4] = {0, 0, 0, 0};

void ledBin(int n, int i)
{
    i++;
    if(n>1){
      ledBin(n/2, i);
    }
    a[3-i] = n%2;
}

int main()
{
    int num;
    srand((unsigned)time(NULL));
    num = rand()%16;
    printf("%d\n",num);
    ledBin(num, -1);
    for(int i=0; i<4; i++){
        printf("%d", a[i]);
    }
    return 0;
}
