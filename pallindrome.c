#include<stdio.h>
int main()
{
    int num,digit,rev,n ;
    rev=0;
    printf("enter a number");
    scanf("%d",&num);  
    n=num;
    do
    {
    digit=n%10;
    rev=rev*10+digit;
    n=n/10;
    } 
    while (n!=0);
    if(rev==num)
    printf("number is pallindrome");
    else
    printf("number is not pallindrome");
    return 0;
}

    

