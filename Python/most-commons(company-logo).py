from collections import Counter

def top_three_characters(s):
    char_counts = Counter(s)
    sorted_counts = sorted(char_counts.items(), key=lambda x: (-x[1], x[0]))

    for char, count in sorted_counts[:3]:
        print(f"{char} {count}")

# Read input
company_name = input().strip()

# Find and print the top three characters and their occurrences
top_three_characters(company_name)
