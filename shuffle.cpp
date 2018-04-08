#include<bits/stdc++.h>
#define swap(a,b) (a)^=(b), (b)^=(a), (a)^=(b)
using namespace std;

int main(){
    int a[50];
    for(int i=0; i<50; i++){
        a[i] = i;
    }
    //种子
    srand((unsigned)time(NULL));
    for(int i=0; i<50; i++){
        //rand()产生0~RAND_MAX的数  10*rand()/RAND_MAX产生一个1~10的数
        int index = rand() % 50;
        swap(a[index], a[i]);
    }
    for(int i=0; i<50; i++){
        cout<<a[i]<<' ';
    }
    system("pause");
    return 0;
}

//java中用Math.random()生成一个0~1的随机数 Math.random()*10生成一个1~10的数
//Random rand=new Random(); int i = rand.nextInt(100);生成一个1~100的数
