input_number=int(input("Enter the number for counting"))
#234355
count=0
while(input_number!=0):
    if(input_number==0):
        print(f"The total numbers are {0}")
    count+=1
    input_number=input_number//10;
print(f"The total number are {count}")