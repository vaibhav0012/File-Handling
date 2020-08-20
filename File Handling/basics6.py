f = open("file.txt","r")
word = input("Enter the desired word: ")
contents = f.read()
list1 = contents.split()
count = 0
for i in range(0,len(list1)):
    if(list1[i]==word):
        count+=1
print(count)