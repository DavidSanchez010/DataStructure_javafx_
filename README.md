Estructuras de Datos Utilizadas
ArrayList

Descripción: ArrayList es una implementación redimensionable de la interfaz List. Se basa en un array que puede crecer en tamaño a medida que se añaden elementos.
Ventajas:
Acceso rápido a elementos mediante índices.
Almacenamiento contiguo en memoria, lo que mejora el rendimiento de caché.
Desventajas:
Las operaciones de inserción y eliminación (excepto al final) son costosas, ya que requieren mover elementos.
Uso en el proyecto: Se utiliza para almacenar una lista de elementos en la pestaña "List".
TreeSet

Descripción: TreeSet es una implementación de la interfaz Set que utiliza un árbol rojo-negro para almacenar elementos ordenados de forma natural.
Ventajas:
Mantiene los elementos ordenados.
Las operaciones de inserción, eliminación y búsqueda son de tiempo logarítmico (O(log n)).
Desventajas:
No permite elementos duplicados.
Menor eficiencia en operaciones de acceso directo en comparación con ArrayList.
Uso en el proyecto: Se utiliza para almacenar y mostrar elementos únicos y ordenados alfabéticamente en la pestaña "Set".
HashMap

Descripción: HashMap es una implementación de la interfaz Map que almacena pares clave-valor. Utiliza una tabla hash para organizar los elementos.
Ventajas:
Operaciones de inserción, eliminación y búsqueda promedio de tiempo constante (O(1)).
Permite null como clave y valor.
Desventajas:
No garantiza ningún orden de los elementos.
Uso en el proyecto: Se utiliza para almacenar jugadores y sus respectivos goles en la pestaña "Pichichi".
PriorityQueue

Descripción: PriorityQueue es una implementación de la interfaz Queue que ordena sus elementos de acuerdo a su orden natural o mediante un comparador proporcionado.
Ventajas:
Proporciona acceso eficiente al elemento más pequeño o más grande.
Las operaciones de inserción y eliminación tienen un tiempo logarítmico (O(log n)).
Desventajas:
No permite acceso aleatorio a elementos.
No garantiza el orden de iteración.
Uso en el proyecto: Se utiliza para ordenar los jugadores por sus goles en orden descendente para mostrar la clasificación.






Licencia del Proyecto
El proyecto utiliza la licencia MIT
