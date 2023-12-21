# tarea2
Cambios relevantes en el proyecto:

- Modifique ambos decorator pattern de forma radical que previamente tenia, encargados de crear los objetos clase y objetos conectores, ya que antes no era posible debido al uso de interzaf el poder hacer setters y getter de coordenadas para las clases
y conectores, o alturas y anchos para los conectores. Se modificaron practicamente todas las clases de estos objetos/patrones como tambien su logica para la decoracion de las clases bases (ConectorBase y ClaseBase)

- ElementosPizarra fue modificado para adaptarse a la nueva creacion de objetos clase y sus decoraciones

- En PizarraUML se puso en funcionamiento los botones para crear clases y el ComboBox para crear conectores, implementando listeners que crean instancias de nuevas clases creadas llamadas DibujaClases y DibujaFlechas para cada caso respectivo

- DibujaClases es la clase encargada de dibujar a tiempo real las diferentes clases de los 3 botones disponibles, genera una vista previa mientras arrastras el mouse y se crear 3 jtextareas para escribir texto como una clase uml
- DibujaFlechas es la clase encargada de dibujar conectores a tiempo real al igual que dibujaclases

- Se modifico PizarraPanel en base a la actualizacion que se requiere al crear instancias de las clase Dibujaclases y DibujaFlechas

Desgraciadamente no se puede dibujar mas de una clase o mas de un conector, si se quiere ver los diferentes tipos de puede crear una pestaña nueva, debe ser la logica seguida en PizarraUML y PizarraPanel para almacenar las instancias de las "Clase dibuja"
