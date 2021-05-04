from collections import Counter
import sys

input = sys.stdin.readline
n = int(input())
s = list(map(int, input().split()))
m = int(input())
s_ = list(map(int, input().split()))
s = Counter(s)
for i in s_: print(s[i], end=" ")
