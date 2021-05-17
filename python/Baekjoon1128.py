numArr = list()
selectedArr = list()

numCount = int(input())
numArr = map(int, input().split(" "))

selectedCount = int(input())
selectedArr = map(int, input().split(" "))


for i in numArr:
    count = 0
    for j in selectedArr:
        if numArr[i] == selectedArr[j]:
            numArr.pop(i)
            count += 1
    print(count)