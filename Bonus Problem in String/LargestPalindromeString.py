## Read input as specified in the question.
## Print output as specified in the question.
#Write your code here
s=input()
k=int(input())
arr=[]
for i in s:
    arr.append(i)
count=0
i=0
e=len(arr)-1
while i<=e:
    if arr[i]!=arr[e]:
        if int(arr[i])<int(arr[e]):
            arr[i]=arr[e]
        else:
            arr[i]=arr[e]
        count+=1
    i+=1
    e-=1
# print(arr)
    
    
if count>k :
    print("NOT POSSIBLE")
elif count==k:
    print("".join(arr))

else:
    k-=count
    i=0
    e=len(arr)-1
    while (i<=e and k>=0):
        if k>=1:
            arr[i]="9"
            arr[e]="9"
            k-=1
        else:
            pass
        i+=1
        e-=1
print("".join(arr))
        
