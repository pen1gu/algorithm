import unittest
from bfs_main import BFS


class MyTestCase(unittest.TestCase):
    graph_list = {
        1: set[3, 4],
        2: set([3, 4, 5]),
        3: set([1, 5]),
        4: set([2, 6]),
        6: set([3, 5])
    }

    root_node = 1

    def bfs_test_case_graph1(self):
        global graph_list
        global root_node

        self.assertEqual(
            BFS.bfs_with_adj_list(BFS(),
                                  graph=graph_list, root=root_node),
        )


if __name__ == '__main__':
    unittest.main()
