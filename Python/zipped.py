# Enter your code here. Read input from STDIN. Print output to STDOUT
num_students, num_subjects = map(int, input().split()) 

sheet = []
for _ in range(num_subjects):
    sheet.append(map(float, input().split()))

for i in zip(*sheet): 
    print(sum(i)/len(i))