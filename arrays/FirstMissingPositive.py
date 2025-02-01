import math
def firstMissingNumber(list):
    minNumber=float('inf')
    maxNumber=float('-inf')
    for num in list:
        minNumber=min(minNumber,num)
        maxNumber=max(maxNumber,num)
    i=minNumber
    while (i<=maxNumber):
        if i not in range(minNumber+1,maxNumber+1):
            return i
        i+=1
    return minNumber,maxNumber

print(firstMissingNumber([3,4,-1,1]))