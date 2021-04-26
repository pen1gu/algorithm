N = int(input())
num_arr = sorted(map(int, input().split(' ')))
M = int(input())
sg_arr = map(int, input().split(' '))


def binary_search(target, data):
    data.sort()
    start = 0
    end = len(data) - 1

    while start <= end:
        mid = (start + end) // 2

        if data[mid] == target:
            return mid
        elif data[mid] < target:
            start = mid + 1
        else:
            end = mid - 1

    return 0

 
result = ''
for i in sg_arr:
    result += str(binary_search(i, num_arr)) + " "
print(result.strip())
