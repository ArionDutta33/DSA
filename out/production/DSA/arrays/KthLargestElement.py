def kthLargest(nums,k):
    result_set=set()
    for i in range(0,len(nums)):
        result_set.add(nums[i])
    return len(result_set)
    
    
    
    
    
nums=[3,2,3,1,2,4,5,5,6]
k=2
result=kthLargest(nums,k)
print(result)