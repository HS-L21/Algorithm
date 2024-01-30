list = [-1 for _ in range(0, 26)]

user_input = input()

for i in range(0, len(user_input)) :
    x = user_input[i]
    idx = ord(x) - ord('a')
    if list[idx] == -1:
        list[idx] = i

print(*list)