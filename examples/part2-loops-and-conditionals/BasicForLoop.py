def main():
    someNumbers = [1,2,3,4,5]
    sumNumbers = 0
    # Using a for-loop, sum the numbers in someNumbers list
    for i in range(0, len(someNumbers)):
        sumNumbers += someNumbers[i]
    print(f"Sum of someNumbers: {sumNumbers}")


if __name__ == "__main__":
    main()