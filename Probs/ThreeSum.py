def threeSum(nums):
    list=[nums[0]]
    currSum=nums[0]
    resList=[]
    for i in range(1,len(nums)):
        currSum+=nums[i]
        list.append(nums[i])
        if(currSum==0):
            resList.append(list)
            currSum=nums[i]
             
    return resList
print(threeSum([-1,0,1,2,-1,-4]))