# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import OrderedDict

def count_distinct_occurrences(n, words):
    word_counts = OrderedDict()

    for word in words:
        if word in word_counts:
            word_counts[word] += 1
        else:
            word_counts[word] = 1

    print(len(word_counts))
    print(*word_counts.values())

# Read input
n = int(input().strip())
words = [input().strip() for _ in range(n)]

# Count distinct occurrences and print the results
count_distinct_occurrences(n, words)