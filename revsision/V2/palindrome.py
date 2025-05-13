def isPalindrome(startIndex,endIndex,inputString):
    while(endIndex>=startIndex):
        if(inputString[endIndex]!=inputString[startIndex]):
            return False;
        startIndex+=1;
        endIndex-=1;
    return True

str=input("Enter the string")
check=isPalindrome(0,len(str)-1,str)
print(check)
