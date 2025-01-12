def unionArrays(a,b):
    result_set=set()
    for i in range(0,len(a)):
        result_set.add(a[i])
    for i in range(0,len(b)):
        if(b[i]not in result_set):
            result_set.add(b[i])
    result=list(result_set)
    result.sort()
    return result

a = [1, 2, 3, 4, 5]
b = [1, 2, 3, 6, 7]
res=unionArrays(a,b)
print(res)

    