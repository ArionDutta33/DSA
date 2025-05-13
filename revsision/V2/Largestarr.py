def getLargest(list):
    maxValue=float('-inf')
    for elem in list:
        if(elem>maxValue):
            maxValue=elem
    return maxValue
print(getLargest([1,2,3,45,6]))
