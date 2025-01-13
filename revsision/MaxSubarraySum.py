def maxSubarraySum(nums):
    # [-2,1,-3,4,-1,2,1,-5,4]
    sum=0
    maxSum=-123
    for i in nums:
        sum+=i
        if(sum<0):
            sum=0
        maxSum=max(maxSum,sum)
    return maxSum

res=maxSubarraySum([-2,1,-3,4,-1,2,1,-5,4])
print(res)