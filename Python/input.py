# Enter your code here. Read input from STDIN. Print output to STDOUT
def check_polynomial(x, k, polynomial):
    result = eval(polynomial.replace('x', str(x)))
    return result == k

# Read input
x, k = map(int, input().split())
polynomial = input().strip()

# Check and print the result
print(check_polynomial(x, k, polynomial))
