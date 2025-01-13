#  two sum optimal
def twoSum(nums,target):
    dict={}
    for i in range(0,len(nums)):
        complement=target-nums[i]
        if complement in dict:
            return [dict[complement],i]
        dict[complement]=i
    return 
            
nums= [2,7,11,15]
target=9
res=twoSum(nums,target)

print(res)