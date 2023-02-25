#include<iostream>
#include<cstdint>
#include<vector>
int main(){
  const uint64_t num_entries = 1UL << 30;
  std::vector<uint64_t> x(num_entries);
  std::vector<uint64_t> y(num_entries);
  std::vector<uint64_t> z(num_entries);
  #pragma omp parallel for
  for(uint64_t i = 0;i<num_entries;i++){
    x[i] = i;
    y[i] = num_entries - i;
  }
  for(uint64_t i = 0;i<num_entries;i++){
    z[i] = x[i] + y[i];
  }
  #pragma omp parallel for
  for(uint64_t i = 0;i<num_entries;i++){
    z[i] = x[i] + y[i];
  }
  for(uint64_t i = 0;i<num_entries;i++){
    std::cout<<z[i]<<' ';
  }
  
}
