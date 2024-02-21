class A():  
    def display(dp):
        print("Display method Inside class A ")
    def show(self):
        print("Show method Inside class A")
    
class B (A): 
    def print(pt):
        print("Print method  Inside class B")    
    def show(self):
        print("Show method Inside class B")
    
class C (B): 
          
    def show(self):
        print("Show method Inside class C ")         
    

s = A()

s.display()
k= B()
k.print()
g = C()   
g.show()