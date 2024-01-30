user_input = input()
numbers = user_input.split()

sum = 0

for number in numbers :
    sum += int(number) ** 2

print( sum % 10 )