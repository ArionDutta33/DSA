import itertools
def kthMissingNumber(arr,k):
    last=arr[len(arr)-1]
    counter=0
    missingNumber=0
    i=1
    while(i>0):
        if i not in arr:
            counter+=1
        if(counter==k):
            missingNumber=i
            break
        i+=1
            
    return missingNumber

print(kthMissingNumber([2,3,4,7,11],5))