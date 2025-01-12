word1 = "abcd"
word2 = "pq"
remaining=word1 if len(word1)>len(word2) else word2
ans=""
i=0
while(i<len(word1) and i<len(word2)):
    ans+=word1[i]
    ans+=word2[i]
    i+=1
print("remaing",remaining)
while(i<len(remaining)):
    ans+=remaining[i]
    i+=1
print(ans)