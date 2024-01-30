user_input = int(input())

star = ""
for number in range(1, user_input + 1) : 
    for num in range(0, number) :
        star += "*"
    star += "\n"

print(star)