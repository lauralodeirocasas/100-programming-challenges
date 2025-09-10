for i in range (1,101):
    y = ""
    if i%3 == 0:
        y+="fizz"
    if i%5 == 0:
        y+="buzz"

    print(y or i)