def removeParenthesis(string):
    countPairs=0;
    ans=""
    for s in string:
        if(countPairs!=0):
            ans+=s
        elif(s=="("):
            countPairs+=1
        elif(s==")"):
            countPairs-=1
    return ans
    
    
    
    
    
    
print(removeParenthesis("(()())(())"))