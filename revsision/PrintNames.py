def printNamesN(n):
    if(n<1):
        return
    printNamesN(n-1)
    print("GFG",end=" ")

printNamesN(5)