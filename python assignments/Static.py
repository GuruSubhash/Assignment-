
class Python:
 staticVariable = 9 
print(Python.staticVariable)


Python.staticVariable = 12
print(Python.staticVariable) 

instance = Python()
print(instance.staticVariable) 

instance.staticVariable = 15
print(instance.staticVariable) 
print(Python.staticVariable) 