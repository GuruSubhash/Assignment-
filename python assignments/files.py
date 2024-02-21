
file1 = open("HW.txt","r")
data = file1.read()
print("printing data")
print(data)
print()

file2 = open("Blank.txt","w")
str1 = 'Python'
file2.write(str1)
print()
print("writing string in file...")

file3 = open("HW.txt","r+")
print(file3.readline(11))
print()


