## Read input as specified in the question.
## Print output as specified in the question.
def reverseColumns(arr,R,C):
  for i in range(C):
    j = 0
    k = C-1
    while j < k:
      arr[j][i],arr[k][i]=arr[k][i],arr[j][i]
      j += 1
      k -= 1
	
# Function for do transpose of matrix 
def transpose(arr,R,C): 
	for i in range(R): 
		for j in range(i, C): 
			t = arr[i][j] 
			arr[i][j] = arr[j][i] 
			arr[j][i] = t 

# Function for print matrix 
def printMatrix(arr,R,C): 
	for i in range(R): 
		for j in range(C): 
			print(str(arr[i][j]), end =" ") 
		print() 

# Function to anticlockwise rotate matrix 
# by 90 degree 
def rotate90(arr,R,C):
    transpose(arr,R,C)
    reverseColumns(arr,R,C)
    printMatrix(arr,R,C)
C=int(input())
R=C
arr=[]
while len(arr)!=C:
    l=[]
    while len(l)!=C:
        l.append(input())
    arr.append(l)
    
rotate90(arr,R,C)
