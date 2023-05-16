lab_08

#1 RecyclerView es una herramienta muy versátil que ofrece varias características para mejorar la experiencia de
usuario y la eficiencia del desarrollo de aplicaciones. Algunas de las características más importantes son las
siguientes:
● Carga eficiente de elementos: Únicamente se cargar los elementos que son visibles en pantalla y los
que están en dirección de desplazamiento. De esta manera, se reduce la sobrecarga de memoria y se
mejora el rendimiento de la aplicación, especialmente en el caso de listas con una gran cantidad de
elementos.
● Personalización de los elementos: Ofrece la posibilidad de personalizar la apariencia de los elementos
de la lista mediante uso de vistas personalizadas (xml item). Lo que permite crear interfaces de usuario
atractivas para nuestra aplicación.
● Animaciones: RecyclerView permite agregar animaciones a los elementos de la lista, lo que mejora
radicalmente la experiencia del usuario al interactuar con la aplicación.
● Interacciones con elementos: Es posible agregar interacciones a los elementos de la lista, como clicks y
pulsaciones largas. Otorgando al usuario un interfaz interactiva y amigable.● Modo de selección: RecyclerView permite habilitar un modo de selección, en el que el usuario puede
seleccionar varios elementos de la lista. Esto es especialmente útil en el caso de aplicaciones que
requieren la selección de varios elementos para realizar una acción determinada.


#2 ● List Item
El archivo list_item.xml se utiliza en conjunto con RecyclerView para definir la vista que se mostrará para
cada elemento de la lista. Este archivo de diseño define la estructura visual y los elementos de diseño de la
vista de cada elemento, ya sea texto, imágenes, botones, etc.
● ViewHolder
El ViewHolder es un componente importante para el RecyclerView, ya que se utiliza para almacenar una
referencia a la vista de cada elemento de la lista. Su principal función es optimizar el rendimiento del
RecyclerView, permitiendo la reutilización de vistas y de reducir la carga en la memoria del dispositivo.
● Adapter
El Adapter dentro de un RecyclerView se encarga de vincular los datos de una lista o de un conjunto de
datos con las vistas que se muestran en pantalla. El Adapter proporciona una manera eficiente de crear y
reutilizar las vistas que se muestran en pantalla al tiempo que se asegura de que los datos se muestran en el
orden y cantidad correctos.


lab_09

#1 Las coroutines son un mecanismo de programación que permite escribir código asíncrono de manera
secuencial y estructurada en Kotlin. A diferencia de los hilos tradicionales, las coroutines son concurrencia
cooperativa, lo que significa que el programador tiene el control para decidir cuándo se suspende y reanuda.

#2 Mientras una coroutine está suspendida, el hilo
subyacente puede ser utilizado para ejecutar otras tareas, evitando bloqueos innecesarios y maximizando la
eficiencia de los recursos. La suspensión en las coroutines de Android se refiere a la capacidad de suspender momentáneamente la
ejecución de una coroutine sin obstruir el main thread. Cuando se suspende una coroutine, el hilo que estaba
utilizando se libera para que otras coroutines o acciones puedan utilizarlo. Como resultado, es posible desarrollar
código asíncrono y no bloqueante que pueda manejar actividades largas o bloqueantes sin interferir con el hilo
principal de la interfaz de usuario o hacer que la aplicación sea inutilizable.

#3 La función de un Dispatcher es especificar en qué hilo (o hilos) se ejecutará una coroutine. el Dispatcher
Dispatchers.Main ejecuta coroutines en el hilo principal de la aplicación, que es también su hilo UI. Esto se puedeutilizar para actualizar la interfaz de usuario o llevar a cabo otras acciones que requieren la participación de la
interfaz de usuario. Por otra parte el Dispatchers.IO para operaciones de entrada o salida de datos intensivas y
Dispatchers.Default para tareas de computación intensiva.

#4 utilizado para lanzar coroutines de manera asíncrona se obtiene el resultado
utilizando el objeto Deferred. El resultado se obtiene mediante la función await(). Y es útil cuando se
deben ejecutar tareas concurrentes y combinar los resultados.
