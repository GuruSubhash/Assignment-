
from audioop import avg
from operator import index
from turtle import position
from typing import final

arr = [10,20,30,40]
print(arr)
sum = 0
for i in range(0,len(arr)):
    sum = sum + arr[i]
print("Sum of all integer values in the array is ",sum) 


print("--------------------------------------------------------------------")


def cal_average(num):
    sum_num = 0
    for i in num:
        sum_num = sum_num + i          

    avg = sum_num / len(num)
    return avg

print("The average of array[10,21,32,43,54] is", cal_average([10,21,32,43,54]))

print("--------------------------------------------------------------------")

arr = [1,3,5,3,1,2,6,5,3,8,6,9]

index = arr.index(3)
print(arr)
print("Index at 3 has ",index)

index = arr.index(9)
print("Index at 9 has ",index)

index = arr.index(8)
print("Index at 8 has ",index)


print("--------------------------------------------------------------------")


arr = [4,5,45,40,50]
print(arr)
for num in arr:
    if num == 5:
        print(" Given Element(5) exist in the array")


print("--------------------------------------------------------------------")

arr = [44,55,0,15,19,5,4]
print(arr)
arr.remove(0)

print("after removing 0 index, array is : ",arr)

print("--------------------------------------------------------------------")

arr = ['k','a','s','h','i']
print(arr)
arr1 = [] 
arr1 = arr.copy() 
print("copying/duplicating arr in arr1")
print(arr1)

print("--------------------------------------------------------------------")

arr = [101,303,404,505,606,707,808,909]
print(arr)
arr.insert(1,202)
print("inserting 202 element at index 1...")
print(arr)

print("--------------------------------------------------------------------")

arr = [100,3,3000,20,500,9999,10000,10003]
print(arr)
minposition = arr.index(min(arr))
print ("The minimum element in the array is at position:", minposition)

maxposition = arr.index(max(arr))
print ("The maximum element in the array  is at position::", maxposition)


print("--------------------------------------------------------------------")


arr = [9,8,7,6,5]
print(arr)
arr.reverse() 
print("reversing the array... using inbuilt 'reverse()' func")
print(arr)

 
print("--------------------------------------------------------------------")


arr = [21,11,31,13,11]
print(arr)

for i in range(0,len(arr)):
    for k in range(i + 1,len(arr)):
        if arr[i] == arr[k]:
            print("Duplicate element in given array:",arr[k])


print("--------------------------------------------------------------------")


arr = ['k','a','s','h','i']
print("first array is",arr)
arr1 = ['s','h','g']
print("second array is",arr1)
print("Common values in given two arrays:",set(arr).intersection(arr1))

print("--------------------------------------------------------------------")

arr = [11,22,33,11,44,55]
print(arr)
finalarr = [] 
for i in arr:
    if i not in finalarr:
        finalarr.append(i)
print("forming set with list")
print(finalarr)

print("--------------------------------------------------------------------")

arr = [101,404,202,909,606,505,808,303,707]
print(arr)
arr.sort() 
print("Second largest number:",arr[-2])


print("--------------------------------------------------------------------")


arr = [1,2,3,4,5,6,7,8,9]
print(arr)
evennumbers = 0
oddnumbers = 0
for i in arr:
    if i % 2 == 0:
        evennumbers += 1
    else:
        oddnumbers += 1 
print("Even Numbers in given array:",evennumbers)
print("Odd Numbers in given array:",oddnumbers)

print("--------------------------------------------------------------------")

arr = [10,6,11,13,14]
print(arr)
arr.sort() 
print("Diffrence of largest and smallest value:",arr[4]-arr[0])


print("--------------------------------------------------------------------")


arr = [1,12,19,23,33,54]
print(arr)
for i in arr:
    if i == 12:
        print("Given element(12) is Exist in array")
    if i == 23:
        print("Given element(23) is Exist in array")
