user_input = input()
N = int(user_input) # 주어지는 숫자의 갯수
user_input = input()
number = user_input

sum = 0

for idx in range (0, len(number)) :
    sum += int(number[idx])

print(sum)