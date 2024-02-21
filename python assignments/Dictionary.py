Dict = dict([(1,'Divya'), (2,'Subhash'), (3,'Deepika'), (4,'Vaishali'), (5,'aakash')])
print("Dictionary with each item as key and pair:",Dict)
Dict[6] = 'Nitya'
print("\n Dictionary with new item added:",Dict)

Dict[3] = 'Navdisha'
print("\n Dictionary with updated values:",Dict)

print("\n Accessing one value in Dictionary:",Dict[1])

del Dict[6]
print("\n Delete a value from a Dictionary:",Dict)

Dict1 = {1: 'Divya', 2: 'Subhash',
        3:{'Age' : 18, 'Branch' : 'CSE', 'Year' : 'Third Year'}}
print("\n Nested loop Dictionary:",Dict1)

print("\n Accessing an element of a Nested Dictionary:",Dict1[2])
