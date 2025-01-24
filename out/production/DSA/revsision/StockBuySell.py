def stockBuySell(nums):
    buy=0
    sell=1
    maxCount=0
    diff=0
    while(sell<len(nums)):
        if(nums[sell]>nums[buy]):
            diff=nums[sell]-nums[buy]
        else:
            buy=sell
        maxCount=max(maxCount,diff)
        sell+=1
    return maxCount
    
        



res=stockBuySell([7,1,5,3,6,4])
print(res)