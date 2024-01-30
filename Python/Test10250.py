user_input = input()
T = int(user_input) # 테스트 케이스

for idx in range(0, T) :
    user_input = input().split()
    H = int(user_input[0])  #층 수
    W = int(user_input[1])  #호 수
    N = int(user_input[2])  #몇 번째로 온 손님인지?

    floor = N % H   # 손님이 머무를 층 (층 수는 나머지!)
    room = N // H + 1 # 손님이 머무를 호수

    if floor == 0 :
        #만약 나머지가 0이면 가장 높은 층!
        floor = H
        room -= 1
    
    print(floor * 100 + room)