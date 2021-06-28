cnt = 0


class Problem:
    def __init__(self):
        global cnt
        cnt = 0
        pass

    def solution(self, S, pattern):
        global cnt
        answer = 0

        len_str = len(S)
        len_pattern = len(pattern)

        for i in range(len_str - len_pattern + 1):
            if S == pattern:
                answer += 1
                continue
            Problem.permutation(self, S[i:len_pattern + i], '', pattern)

        answer = cnt
        return answer

    def permutation(self, S, prefix, compareStr):
        global cnt

        if len(S) == 0:
            if prefix == compareStr:
                cnt += 1
        else:
            for i in range(len(S)):
                tmp = S[0:i] + S[i + 1:]
                Problem.permutation(self, tmp, prefix + S[i], compareStr)
