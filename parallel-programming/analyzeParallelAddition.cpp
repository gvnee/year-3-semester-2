#include<iostream>
#include<math.h>
using namespace std;

void calculate(int n, int p){
  double timeTaken, speedup, efficiency, cost;
  double seqTime = n - 1;
  timeTaken = log2(p) * 6 + n / p - 1;
  cout<<"time taken: "<<timeTaken<<"\n";
  speedup = seqTime / timeTaken;
  cout<<"speedup: "<<speedup<<"\n";
  efficiency = speedup / p;
  cout<<"efficiency: "<<efficiency<<"\n";
  cost = timeTaken * p;
  cout<<"cost: "<<cost<<"\n";
}

int main(){
  int n = 2048;

  for(int i = 1;i<=1024;i*=2){
    cout<<"p: "<<i<<"\n";
    calculate(n, i);
  }

  return 0;
}