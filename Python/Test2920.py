asc = [1, 2, 3, 4, 5, 6, 7, 8]
des = [8, 7, 6, 5, 4, 3, 2, 1]

user_input = [int(x) for x in input().split()]

ascT = True
decT = True
for num in range(0, 8):
    if user_input[num] != asc[num] :
        ascT = False
    if user_input[num] != des[num] :
        decT = False


if ascT:
    print("ascending")
elif decT:
    print("descending")
else :
    print("mixed")