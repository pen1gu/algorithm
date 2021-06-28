_cnt = 0


class Problem:
    def __init__(self):
        global _cnt
        _cnt = 0
        pass

    def solution(self, str, pattern):
        global _cnt

        answer = 0

        len_str = len(str)
        len_pattern = len(pattern)

        if len_str == len_pattern:
            _cnt = 1
            return _cnt

        for i in range(len_str - len_pattern + 1):
            compare_str = str[i:len_pattern + i]
            n = ''
            str_temp = compare_str

            for j in range(len_str * len_pattern):
                if len(str_temp) == 0:
                    print(n)
                    if n == pattern:
                        answer += 1
                else:
                    str_temp_len = len(str_temp)
                    for k in range(str_temp_len):  # str 의 길이 만큼 돌면서 한 알파벳이 맨 앞의 왔을 때의 경우 구하기
                        n = n + str_temp[k]
                        str_temp = compare_str[0:k] + compare_str[k + 1:]
                        # print(str_temp)

        return answer

    def permutaion(self, str, n, pattern):
        answer = 0

        return answer


if __name__ == '__main__':
    Problem.solution(Problem, "random", "dnar")
