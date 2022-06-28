#include <stdio.h>
#include <string.h>

void func(char a[]);
int add(int a, int b);
void swap(int a, int b);

struct person{
    int id;
    char name[20];
    int salary;
} emp;

int main(){
    //char a[] = "Hello";
    //printf("%s", a);
    //func(a);
    //printf("%s", a);

    //printf("%d", add(3,5)- add(4,2));
    /*
    int num1 = 0, num2 = 1;

    printf("%d %d ", num1, num2);
    swap(num1, num2);
    printf("%d %d ", num1, num2);
    */

    //scanf("%d %s %d", &emp.id, emp.name, &emp.salary);
    //printf("%d %s %d", emp.id, emp.name, emp.salary);
    /*
    char a[20];
    int i, j, len = 0;
    scanf("%s", a);
    for(i = 0; a[i] != 0; i++) len++;

    for(i = 0, j = len-1; i < j; i++, j--){
        if(a[i] == a[j]) continue;

        printf("0");
        return 0;
    }
    printf("1");*/
    int a[12], i, cnt1 = 0, cnt2 = 0;
    for(i = 0; i < 10; i++) a[i] = i+1;

    for(i = 0; i < 10; i++)
        if(a[i] % 3 == 0 || a[i] % 5 == 0) cnt1++;
        else cnt2++;
    
    printf("%d %d\n", cnt1, cnt2);
    printf("%d\n", cnt1 * cnt2);


    return 0;
}

void func(char a[]){
    a[strlen(a)-1] = 0;
}

int add(int a, int b){
    return a+b;
}

void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
}