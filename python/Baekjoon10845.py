import sys


def push(x):
    queue.append(x)


def pop():
    if (not queue):
        return -1
    else:
        return queue.pop()


def size():
    return len(queue)


def empty():
    return 0 if queue else 1


def top():
    return queue[-1] if queue else -1


N = int(sys.stdin.readline().rstrip())
queue = list()

for _ in range(N):
    input_split = sys.stdin.readline().rstrip().split()

    order = input_split[0]

    if order == "push":
        push(input_split[1])
    elif order == "pop":
        print(pop())
    elif order == "size":
        print(size())
    elif order == "empty":
        print(empty())
    elif order == "top":
        print(top())
