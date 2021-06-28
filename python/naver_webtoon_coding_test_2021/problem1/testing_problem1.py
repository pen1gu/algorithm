import unittest
from problem1_exam import Problem


class MyTestCase(unittest.TestCase):

    def test_permutation_case1(self):  # 같은 단어가 없는 일반적인 경우
        self.assertEqual(Problem.solution(Problem(), "random", "danr"), 1)

    def test_permutation_case2(self):  # 같은 단어가 있는 경우
        self.assertEqual(Problem.solution(Problem(), "abab", "ab"), 3)

    def test_permutation_case3(self):
        self.assertEqual(Problem.solution(Problem(), "random", "dnom"), 1)

    def test_permutation_case4(self):
        self.assertEqual(Problem.solution(Problem(), "fasfsdfasdfw4qfsd", "fasd"), 4)

    def test_permutation_case5(self):
        self.assertEqual(Problem.solution(Problem(), "안녕안하세요", "안녕"), 2)


if __name__ == '__main__':
    unittest.main()
