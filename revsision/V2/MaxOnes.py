def max_ones(list):
    one_count=0;
    max_one_count=float("-inf")
    for elem in list:
        if(elem==1):
            one_count+=1
            max_one_count=max(one_count,max_one_count)
        else:
            one_count=0
    return max_one_count

print(max_ones([1,1,0,1,1,1,]))