from random import randint

x = randint(0, 300)
while True:
    digit = eval(input('please input a number between 0 to 300: '))
    if digit == x:
        print("Bingo!")
        break
    elif digit > x:
        print("Too large,please try again.")
    else:
        print("Too small,please try again.")