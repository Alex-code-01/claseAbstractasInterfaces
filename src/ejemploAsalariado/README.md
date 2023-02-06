# Clases abstractas e Interfaces. Ejemplo 2: Asalariado

Se implementan las clases en código a partir del siguiente diagrama de clases UML:


![Diagrama de clases UML](../imagenes/asalariado-uml.png)

Clase Empleado: 
- Clase madre de Comercial, Contable y Directivo (relación de herencia). 
- Implementa la interfaz Asalariado (recibiendo el método abstracto salario())
- Clase abstracta (para obligar a las clases hijas a implementar los métodos abstractos).
