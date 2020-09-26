## Read input as specified in the question.
## Print output as specified in the question.

#--------------------------------Python Implementation---------------------------------
s=input()
arr=[0]*256
# for i in s:
#     arr[ord(i)]+=1
s=sorted(s)
v=0
ans=""
for i in s:
    if s.count(i)%2==1:
        v+=1
if v>1:
    print("")
else:
    
    tmp=""
    if len(s)%2==1:
        for i in s:
            if s.count(i)==1:
                s.remove(i)
                tmp=i
        for i in range(0,len(s)-1,2):
            ans+=s[i]
            # print(s[i],end="")
        tmp+=ans[::-1]
        ans+=tmp
    else:
        for i in range(0,len(s)-1,2):
            ans+=s[i]
            # print(s[i],end="")
        ans+=ans[::-1]
print(ans)
    
