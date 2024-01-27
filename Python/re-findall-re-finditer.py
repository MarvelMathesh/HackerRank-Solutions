# Enter your code here. Read input from STDIN. Print output to STDOUT
import re

def find_matching_substrings(s):
    # Define regular expression pattern
    pattern = re.compile(r'(?<=[qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM])[aeiouAEIOU]{2,}(?=[qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM])')

    # Find all matches in the string
    matches = re.findall(pattern, s)

    return matches if matches else -1

# Read input
input_string = input().strip()

# Find and print matching substrings
result = find_matching_substrings(input_string)

if result == -1:
    print(result)
else:
    for substring in result:
        print(substring)
