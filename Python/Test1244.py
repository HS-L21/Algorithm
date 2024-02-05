N = int(input())  # 스위치의 갯수

arr = list(map(int, input().split()))  # 스위치의 상태

students = int(input())  # 학생 수

for _ in range(students):
    gender, number = map(int, input().split())  # 남학생 = 1, 여학생 = 2

    if gender == 1:
        # 남학생이면 배수의 상태로 변경
        for j in range(N):
            if (j + 1) % number == 0:
                arr[j] = 1 - arr[j]
    else:
        # 여학생일 경우
        arr[number - 1] = 1 - arr[number - 1]
        for j in range(1, N // 2 + 1):
            if number - 1 + j >= N or number - 1 - j < 0:
                break

            if arr[number - 1 - j] == arr[number - 1 + j]:
                arr[number - 1 - j] = 1 - arr[number - 1 - j]
                arr[number - 1 + j] = 1 - arr[number - 1 + j]
            else:
                break

for i in range(N):
    print(arr[i], end=" ")
    if (i + 1) % 20 == 0:
        print()
