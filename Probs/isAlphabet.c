#include<stdio.h>
int main(){
    char inputCharacter;
    scanf("%c",&inputCharacter);
    if(inputCharacter>='A'&&inputCharacter<='Z'||inputCharacter>='1'&&inputCharacter<='9'){
        printf("alphabet or number");
    }else{
        printf("Special character");
    }
}