while True:
    print("SIMPLE CALCULATOR")
    print("1. ADD")
    print("2. SUBTRACT")
    print("3. MULTIPLY")
    print("4. DIVIDE")
    print("5. EXIT")
    
    choice = input("Enter choice: ")

    if choice == "5":
        print("Exiting Calculator")
        break

    if choice in ['1', '2', '3', '4']:
        A = float(input("Enter first number: "))
        B = float(input("Enter second number: "))

        if choice == '1':
            print(f"{A} + {B} = {A + B}")
        elif choice == '2':
            print(f"{A} - {B} = {A - B}")
        elif choice == '3':
            print(f"{A} * {B} = {A * B}")
        elif choice == '4':
            if B != 0:
                print(f"{A} / {B} = {A / B}")
    else:
        print("Invalid choice, please enter a valid option.")
