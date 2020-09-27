## Read input as specified in the question.
## Print output as specified in the question.
#Write your code here
n=int(input())
ans=""
s="zabcdefghijklmnopqrstuvwxy"
s=s.upper()
lst=[]
for i in s:
    lst.append(i)
# print(lst)
while n!=0:
    rem=n%26
    ans+=lst[rem]
    x=n//26
    if rem==0:
        n=x-1
    else:
        n=x
print(ans[::-1])
