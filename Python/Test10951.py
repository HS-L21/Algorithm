try:
    while True : 
        user_input = input()
        numbers = user_input.split()
        A = int(numbers[0])
        B = int(numbers[1])

        print(A + B)
except EOFError:
    pass