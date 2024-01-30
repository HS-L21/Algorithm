user_input = input()
N = int(user_input) # 테스트 케이스

user_input = input()
numbers = [int(number) for number in user_input.split()]

min = numbers[0]
max = numbers[0]

for idx in range (1, N) :
    if min > numbers[idx] :
        min = numbers[idx]
    
    if max < numbers[idx] : 
        max = numbers[idx]


print("{} {}".format(min, max))
    