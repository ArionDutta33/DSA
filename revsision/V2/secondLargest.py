def second_largest(list):
    largest=list[0]
    second_largest=float("-inf")
    for elem in list:
        if(elem>largest):
            second_largest=largest
            largest=elem
        elif(elem>second_largest and elem<largest):
            second_largest=elem
    return second_largest

print(second_largest([1,2,3,4,5]))
