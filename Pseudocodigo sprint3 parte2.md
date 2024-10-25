# Pseudocódigo

Inicio  
&nbsp;&nbsp;&nbsp;&nbsp;Definir  puntos  como entero inicializado en 0  

### Apartado 1
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "Número de registro del niño: "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer  numRegistro  como entero  

### Apartado 2
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "¿Tienes un hermano en el colegio? (0: no / 1: sí): "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer  hermano  como entero  
&nbsp;&nbsp;&nbsp;&nbsp;Si  hermano es igual a 1, entonces  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; puntos  =  puntos  + 40  
&nbsp;&nbsp;&nbsp;&nbsp;Fin Si  

### Apartado 3
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "¿Vives en la misma zona que el colegio? (0: no / 1: sí): "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer  zonaColegio  como entero  

### Apartado 4
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "¿Tu padre o madre trabaja en la misma zona que el colegio? (0: no / 1: sí): "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer  trabajaZona  como entero  

&nbsp;&nbsp;&nbsp;&nbsp;Si  zonaColegio  es igual a 1, entonces  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;puntos = puntos + 30  
&nbsp;&nbsp;&nbsp;&nbsp;Sino, si  trabajaZona  es igual a 1, entonces  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; puntos  =  puntos  + 20  
&nbsp;&nbsp;&nbsp;&nbsp;Fin Si  

### Apartado 5
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "¿Tienes alguna enfermedad o discapacidad superior al 30% o alguna enfermedad crónica? (0: no / 1: sí): "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer  enfermedad  como entero  
&nbsp;&nbsp;&nbsp;&nbsp;Si  enfermedad  es igual a 1, entonces  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; puntos  =  puntos  + 10  
&nbsp;&nbsp;&nbsp;&nbsp;Fin Si  

### Apartado 6
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "¿Tu familia es numerosa o monoparental? (0: no / 1: sí): "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer  familiaNumerosa  como entero  
&nbsp;&nbsp;&nbsp;&nbsp;Si  familiaNumerosa  es igual a 1, entonces  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; puntos  =  puntos  + 15  
&nbsp;&nbsp;&nbsp;&nbsp;Fin Si  

### Apartado 7
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "¿Tu padre, madre, tutor legal o hermano ha estado escolarizado en la escuela? (0: no / 1: sí): "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer  escolarizado  como entero  
&nbsp;&nbsp;&nbsp;&nbsp;Si  escolarizado  es igual a 1, entonces  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; puntos  =  puntos  + 5  
&nbsp;&nbsp;&nbsp;&nbsp;Fin Si  

### Resultados
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "Número de registro: " +  numRegistro   
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "Puntuación total: " +  puntos  + " puntos."  

Fin
