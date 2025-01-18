def twoSumSorted(arr,target):
    # find the largest number smaller or equal to target
    start=0;
    end=len(arr)-1
    while(start<end):
        mid=arr[start]+arr[end]
        if(mid>target):
            end-=1
        elif(mid<target):
           start+=1
        else:
            return[start+1,end+1]
    print(start,end)
       
    
    
    
    
nums =[2,7,11,15]
target = -1
pivot=twoSumSorted(nums,target)
print(pivot)