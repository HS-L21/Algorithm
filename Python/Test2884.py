user_input = input().split()
H = int(user_input[0])
M = int(user_input[1])

if M - 45 < 0 :
    H -= 1
    M += 15
    if H < 0 :
        H = 23
else :
    M -= 45

print("{} {}".format(H, M))
