A = int(input())
B = int(input())
C = int(input())

ABC = str(A * B * C)

numbers = [0 for x in range(10)]

for num in range(0, len(ABC)):
    numbers[int(ABC[num])] += 1

for num in numbers :
    print(num)