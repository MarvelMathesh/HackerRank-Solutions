# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import groupby

def string_compression(s):
    compressed_string = ''
    
    for key, group in groupby(s):
        count = len(list(group))
        compressed_string += f"({count}, {key}) "

    return compressed_string.strip()

# Read input
input_string = input().strip()

# Perform compression and print the result
result = string_compression(input_string)
print(result)
