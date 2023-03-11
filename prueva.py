class persona:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        
    def saludar(self):
        return f"hola yo soy {self.name} y tengo {self.age} años"


persona1= persona('Hector',25)

print(persona1.saludar())

