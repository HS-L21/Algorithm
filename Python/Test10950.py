user_input = input()
T = int(user_input) # 테스트 케이스

for idx in range(0, T) : 
    user_input = input()
    numbers = user_input.split()
    A = int(numbers[0])
    B = int(numbers[1])
    print(A + B)