T = int(input())    #테스트 케이스

for _ in range(0, T):
    user_input = input().split()
    R = int(user_input[0])  #반복해야할 횟수
    S = user_input[1]   #문자열

    st = ""
    for x in S :
        for _  in range(0, R) :
            st += x
    print(st)