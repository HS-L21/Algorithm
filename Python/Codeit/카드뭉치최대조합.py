def max_product(left_cards, right_cards):
    # 여기에 코드를 작성하세요
    max_val = 0
    for x in left_cards :
        for y in right_cards :
            max_val = max(max_val, x * y)
    return max_val
    
# 테스트 코드
print(max_product([1, 6, 5], [4, 2, 3]))
print(max_product([1, -9, 3, 4], [2, 8, 3, 1]))
print(max_product([-1, -7, 3], [-4, 3, 6]))
