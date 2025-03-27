L= input("Enter your number list: ")
num_list = [int(x) for x in L.split()]
print("Your List: ",num_list)
ltf=[y for y in num_list if y < 5]
print("Numbers less than 5: ",ltf)
