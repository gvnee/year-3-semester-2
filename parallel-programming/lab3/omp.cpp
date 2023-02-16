#include<iostream>
#include<omp.h>
int main(){
  #pragma omp parallel
  {
    int i = omp_get_thread_num();
    int n = omp_get_num_threads();
    std::cout<<i<<" of "<<n<<"\n";
  }
}