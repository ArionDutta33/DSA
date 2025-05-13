num=int(input("Enter the number"))
original_num=num
rev=0
digits=0
while(num!=0):
    digits=num%10
    rev=rev*10+digits
    num=num//10
print(f"The original number is {original_num} and reversed number is {rev}")