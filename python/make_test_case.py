import random

x_set = set()
y_set = set()

i = 0
while i != 3000:
    x = int(random.randrange(1, 3000))
    y = int(random.randrange(1, 3000))

    if x not in x_set and y not in y_set:
        x_set.add(x)
        y_set.add(y)
        print("{0} {1}".format(x, y))
        i += 1
