f= open("file.txt","r")
num = input("Enter the number of Lines: ")
for i in range (int(num)):
    print(f.readline())