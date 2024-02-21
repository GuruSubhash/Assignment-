class Super:
     
     var1 = None
 
     var2 = None
     
     var3 = None
     
     def __init__(self, var1, var2, var3): 
          self.var1 = var1
          self.var2 = var2
          self.var3 = var3
     
     def displayPublicMembers(self):
  
          print("Public Data Member is", self.var1)
        
     def displayProtectedMembers(self):
  
          print("Protected Data Member is", self.var2)
      
     def displayPrivateMembers(self):
  
          print("Private Data Member is ", self.var3)
 
     def accessPrivateMembers(self):    
           
          self.displayPrivateMembers()
  
class Sub(Super):
  
       def __init__(self, var1, var2, var3):
                Super.__init__(self, var1, var2, var3)
           
       def accessProtectedMembers(self):
                 
                self.displayProtectedMembers()
  
obj = Sub("KG", 5 , "KG !")
 
obj.displayPublicMembers()
obj.accessProtectedMembers()
obj.accessPrivateMembers()
try:
     print("Object is accessing protected member:", obj.var2)

except AttributeError e:
       print(e) 
       print("object can not access private member, so it will generate Attribute error")
   

 
