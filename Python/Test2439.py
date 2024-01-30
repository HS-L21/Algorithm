user_input = input()
N = int(user_input)
answer = ""
for n in range(N, 0, -1) : #역순으로 돌리기
    for idx in range (0, n - 1) :
        answer += " "
    for idx in range(n - 1, N) :
        answer += "*"
    answer += "\n"

print(answer)