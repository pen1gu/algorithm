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
<<<<<<< HEAD
    print(count)
=======
    print(count)
>>>>>>> b814fea120410ae197a5f421813617e20ab25c0c
