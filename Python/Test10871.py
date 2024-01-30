user_input = input()
numbers = user_input.split()

N = int(numbers[0])
X = int(numbers[1])

user_input = input()
numbers = user_input.split()

answer = ""
for num in range(0, N) :
    Y = int(numbers[num])
    if Y < X :
        answer += str(Y) + " "

print(answer)