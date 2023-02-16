#include<iostream>
#include<omp.h>
int main(){
  int arr[] = {4, 3, 5, 8, 2, 6, 3, 1};
  int len = sizeof(arr)/sizeof(int);
  
  // std::cout<<"array: ";
  // for(int i = 0;i<len;i++) std::cout<<arr[i]<<" ";
  // std::cout<<"\n";
  
  // for(int i = 1;i<len;i++) arr[i] += arr[i-1];

  // std::cout<<"prefix sum: ";
  // for(int i = 0;i<len;i++) std::cout<<arr[i]<<" ";
  // std::cout<<"\n";


  //parallel
  int reg[len] = {0};
  #pragma omp parallel for
    for(int i = 0;i<len;i++) reg[i] = arr[i];

  for(int i = 0;i<len;i++) std::cout<<reg[i]<<" ";
  std::cout<<std::endl;

  #pragma omp parallel for
    for(int i = 1;i<len;i++) reg[i] += arr[i-1];
  
  #pragma omp parallel for
    for(int i = 0;i<len;i++) arr[i] = reg[i];

  for(int i = 0;i<len;i++) std::cout<<reg[i]<<" ";
  std::cout<<std::endl;

  #pragma omp parallel for
    for(int i = 2;i<len;i++) {
      reg[i] += arr[i-2];
    }
  #pragma omp parallel for
  for(int i = 0;i<len;i++) arr[i] = reg[i];
  for(int i = 0;i<len;i++) std::cout<<reg[i]<<" ";
  std::cout<<std::endl;

  #pragma omp parallel for
  for(int i = 4;i<len;i++) {
    reg[i] += arr[i-4];
  }
  #pragma omp parallel for
  for(int i = 0;i<len;i++) arr[i] = reg[i];
  for(int i = 0;i<len;i++) std::cout<<reg[i]<<" ";
  std::cout<<std::endl;
  
}