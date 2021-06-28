_cnt = 0


class Problem:
    def __init__(self):
        global _cnt
        _cnt = 0

        pass

    def solution(self, input, pattern):
        global _cnt

        input_len = len(input)
        pattern_len = len(pattern)

        if input_len == 1:
            _cnt = 1
            return _cnt

        for i in range(input_len - pattern_len + 1):
            Problem.permutation(Problem, input[i:i + pattern_len], '', pattern)

        return _cnt

    def permutation(self, input, prefix, pattern):
        global _cnt

        input_len = len(input)
        if input_len == 0:
            # print(prefix)
            if pattern == prefix:
                _cnt += 1
        else:
            for i in range(input_len):
                input_value = input[0:i] + input[i + 1:]
                Problem.permutation(Problem, input_value, prefix + input[i], pattern)


if __name__ == '__main__':
    print(Problem.solution(Problem(), "안녕하녕세요", "녕하"))
