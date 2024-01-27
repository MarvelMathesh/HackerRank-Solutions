# Enter your code here. Read input from STDIN. Print output to STDOUT
import re

def is_valid_uid(uid):
    # Rule 1: At least 2 uppercase English alphabet characters
    if len(re.findall(r'[A-Z]', uid)) < 2:
        return False

    # Rule 2: At least 3 digits
    if len(re.findall(r'\d', uid)) < 3:
        return False

    # Rule 3: Only alphanumeric characters, no repetitions
    if not re.match(r'^[a-zA-Z0-9]{10}$', uid):
        return False

    # Rule 4: No character should repeat
    if len(set(uid)) != len(uid):
        return False

    return True

# Read the number of test cases
t = int(input().strip())

# Validate each UID
for _ in range(t):
    uid = input().strip()
    if is_valid_uid(uid):
        print("Valid")
    else:
        print("Invalid")
