user_input = input()
user_numbers = user_input.split()

A = int(user_numbers[0])
B = int(user_numbers[1])

if A > B :
    print(">")
elif A < B:
    print("<")
else :
    print("==")