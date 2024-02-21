
print ("Guru Subhash") 


print("Multi-line commenting")


a = -5
print("Type of a: ", type(a))
b = False
print("Type of b: ", type(b))
c = 5.0
print("Type of c: ", type(c))
String = 'String'
print("Type of String: ", type(String))


a = 5
def f():
    print('I am  Inside f() : ', a)
def g():
    a = 2
    print('I am  Inside g() : ', a) 
def h():
    global a
    a = 4      
    print('I am  Inside h() : ', a)  
print('global : ', a)
f()
print('global : ', a)
g()
print('global : ', a)
h()
print('global : ', a)