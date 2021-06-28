def solution(S, pattern):
    answer = 0
    global cnt

    s_len = len(S)
    pattern_len = len(pattern)

    for i in range(s_len - pattern_len + 1):
        if S == pattern:
            answer += 1
            continue

        permutation(S[i:pattern_len + i], "", pattern)

    answer = cnt
    return answer


def permutation(str, prefix, compareStr):
    global cnt

    if len(str) == 0:
        print(prefix)
        if prefix == compareStr:
            cnt += 1
    else:
        for i in range(len(str)):
            tmp = str[0: i] + str[i+1:]
            permutation(tmp, prefix + str[i], compareStr)

cnt = 0
print(solution("tegsornamwaresomran", "ransom"))
#print(solution("random", "danr"))
