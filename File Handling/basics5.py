f = open("file.txt","r")
contents = f.read()
list1 = contents.split()
max1 =''
for i in range(0,len(list1)):
    if(len(list1[i])>len(max1)):
        max1 = list1[i]
print(max1)