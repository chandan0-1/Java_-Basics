
n=int(input())
i=0
j=0
for _ in range(n):
    
    for x in range(1,n-j+1):
        # if x<(5+1-x):
        print(x,end="")
    # for x in range(i):
        # else:
    for x in range(j):
            print("*",end="")
    j+=1

    # j=0
    k=n
    for x in range(i):
            print("*",end="")
            k-=1
    
    for x in range(1,n-i+1):
        # if x<(5+1-x):
        print(k,end="")
    # for x in range(i):
        # else:
        k-=1
    
    i+=1
    print()
