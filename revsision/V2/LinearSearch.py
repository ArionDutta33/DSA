def find_element(key,list):
    for elem in list:
        if key==elem:
            return True
    return False

print(find_element(1212,[1,2,3,4,65,12,3,2]))