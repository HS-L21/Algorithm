T = int(input())

for _ in range (0, T) : 
    user_input = input()
    str = user_input.split("X")
    str = [val for val in str if val != '']

    sum = 0
    for x in str :
        for i in range (1, len(x) + 1) :
            sum += i

    print(sum)