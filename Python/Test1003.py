def fibonacci(N):
    fibonacci0 = [0] * 41
    fibonacci1 = [0] * 41
    fibonacci0[0] = 1
    fibonacci1[0] = 0
    fibonacci0[1] = 0
    fibonacci1[1] = 1

    for i in range(2, N + 1):
        fibonacci0[i] = fibonacci0[i - 1] + fibonacci0[i - 2]
        fibonacci1[i] = fibonacci1[i - 1] + fibonacci1[i - 2]

    return fibonacci0[N], fibonacci1[N]



T = int(input())  # 주어지는 테스트 케이스 수

for _ in range(T):
    N = int(input())
    result = fibonacci(N)
    print(result[0], result[1])
