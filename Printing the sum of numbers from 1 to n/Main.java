#include <stdio.h>
int main() {
	int n;
  int sum=0;
  scanf("%d",&n);
  for(int num=1;num<=n;num++)
  {
    sum=sum+num;
  } 
  printf("%d",sum);
	return 0;
}