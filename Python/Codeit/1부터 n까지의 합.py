def consecutive_sum(start, end):
    # 여기에 코드를 작성하세요
    if start == end :
        return start
        
    # 절반으로 나누기
    mid = (start + end) // 2
    
    #나눈 값을 재귀적으로 풀어서 더하기
    return consecutive_sum(start, mid) + consecutive_sum(mid + 1, end)

# 테스트 코드
print(consecutive_sum(1, 10))
print(consecutive_sum(1, 100))
print(consecutive_sum(1, 253))
print(consecutive_sum(1, 388))
