user_input = input().upper()

my_list = [0] * 26

for x in user_input:
    idx = ord(x) - ord('A')
    my_list[idx] += 1

max_count = max(my_list)

if my_list.count(max_count) == 1:
    max_index = my_list.index(max_count)
    result_char = chr(ord('A') + max_index)
    print(result_char)
else:
    print("?")
