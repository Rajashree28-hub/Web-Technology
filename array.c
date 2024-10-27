#include<stdio.h>
void main()
{
    int A[10],i;
    printf("enter element to array");
    for(i=0;i<10;i++)
    {
        scanf("%d",&A[i]);
        
    }
    printf("the array element are");
    for(i=0;i<10;i++)
    {
        printf("%d\n",A[i]);
    }
}