import operator

n = int(input())


def slope(p1, p2):
    return abs((p2[1] - p1[1]) / (p2[0] - p1[0]))


tmp = []
for _ in range(n):
    x, y = map(int, input().split())
    tmp.append([x, y])

points = sorted(tmp, key=lambda x: x[0])
a = []
for i in range(n - 1):
    a.append([points[i], points[i + 1], slope(points[i], points[i + 1])])

a = sorted(a, key=lambda x: (-x[2]))

min_gra = a[0][2]
min_gra_list = list()

cnt = 0
for i in a:
    if i[2] == min_gra:
        min_gra_list.append(i)
    cnt += 1

if cnt == 1:
    print(tmp.index(a[0][0]) + 1, tmp.index(a[0][1]) + 1)
else:
    pass
