from abc import ABC, abstractmethod
 
class Polygon(ABC): 
 
    @abstractmethod
    def no_ofsides(self):
        pass
 
class Triangle(Polygon): 
 
    def no_ofsides(self):
        print("Triangle have 3 sides")
 
class Pentagon(Polygon): 
 
    def no_ofsides(self):
        print("Pentagon have 5 sides")
 
class Hexagon(Polygon): 
 
    def no_ofsides(self):
        print("Hexagon have 6 sides")
 
class Quadrilateral(Polygon): 
 
    def no_ofsides(self):
        print("Quadrilateral have 4 sides")
 
R = Triangle()
R.no_ofsides()
 
K = Quadrilateral()
K.no_ofsides()
 
R = Pentagon()
R.no_ofsides()
 
K = Hexagon()
K.no_ofsides()
