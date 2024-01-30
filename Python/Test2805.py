import sys
from collections import Counter

# 입력
n, m = map(int, sys.stdin.readline().split())
trees = Counter(map(int, sys.stdin.read().split()))

# 초기 설정
start_height = 1
end_height = 1000000000

while start_height <= end_height:
    mid_height = (start_height + end_height) // 2  # 중간값 설정

    # 중간값을 기준으로 잘랐을 때 가져갈 수 있는 나무 길이 합 계산
    total_cut = sum((height - mid_height) * count for height, count in trees.items() if height > mid_height)

    if total_cut >= m:  
        start_height = mid_height + 1 
    elif total_cut < m: 
        end_height = mid_height - 1 

# 결과 출력
print(end_height)  # 최종 결과 출력
