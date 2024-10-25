# Pseudocódigo

Inicio  
&nbsp;&nbsp;&nbsp;&nbsp;Definir   largo1   como 300.3  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "Introduce el ancho de la primera piscina: "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer   ancho1   como decimal  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "Introduce la profundidad de la primera piscina: "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer   profundidad1   como decimal  

&nbsp;&nbsp;&nbsp;&nbsp;Definir   largo2   como 300.3  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "Introduce el ancho de la segunda piscina: "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer   ancho2   como decimal  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "Introduce la profundidad de la segunda piscina: "  
&nbsp;&nbsp;&nbsp;&nbsp;Leer   profundidad2   como decimal  

### Apartado 1
&nbsp;&nbsp;&nbsp;&nbsp;  area1   = entero(  ancho1   *   largo1  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El área de la primera piscina es: " +   area1   + " m²"  
&nbsp;&nbsp;&nbsp;&nbsp;  area2   = entero(  ancho2   *   largo2  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El área de la segunda piscina es: " +   area2   + " m²"  

### Apartado 2
&nbsp;&nbsp;&nbsp;&nbsp;  volumen1   = entero(  area1   *   profundidad1  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El volumen de la primera piscina es: " +   volumen1   + " Litros"  
&nbsp;&nbsp;&nbsp;&nbsp;  volumen2   = entero(  area2   *   profundidad2  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El volumen de la segunda piscina es: " +   volumen2   + " Litros"  

### Apartado 3
&nbsp;&nbsp;&nbsp;&nbsp;  anchoTotal   =   ancho1   +   ancho2    
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El ancho y el largo de ambas piscinas juntas es: " +   largo1   + " m de largo y " +   anchoTotal   + " m de ancho"  

### Apartado 4
&nbsp;&nbsp;&nbsp;&nbsp;  areaTotal   = entero(  anchoTotal   *   largo1  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El área de ambas piscinas es de: " +   areaTotal   + " m²"  

### Apartado 5
&nbsp;&nbsp;&nbsp;&nbsp;  volumenTotal   = entero(  areaTotal   *   profundidad1  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El volumen de ambas piscinas es de: " +   volumenTotal   + " Litros"  

### Apartado 6
&nbsp;&nbsp;&nbsp;&nbsp;  aux   =   profundidad1    
&nbsp;&nbsp;&nbsp;&nbsp;  profundidad1   =   profundidad2    
&nbsp;&nbsp;&nbsp;&nbsp;  profundidad2   =   aux    
&nbsp;&nbsp;&nbsp;&nbsp;  volumen1   = entero(  area1   *   profundidad1  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El nuevo volumen de la primera piscina es: " +   volumen1   + " Litros"  
&nbsp;&nbsp;&nbsp;&nbsp;  volumen2   = entero(  area2   *   profundidad2  )  
&nbsp;&nbsp;&nbsp;&nbsp;Mostrar "El nuevo volumen de la segunda piscina es: " +   volumen2   + " Litros"  

Fin  
