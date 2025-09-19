package com.pjsoft.libraryapp.models

data class Book(
    val id : Int,
    val title : String,
    val author : String,
    val year : Int,
    val description : String,
    val image : String
)
val books = listOf(
    Book(1, "Cien años de soledad", "Gabriel García Márquez", 1967, "Una saga familiar en el pueblo ficticio de Macondo.", "https://ejemplo.com/imagenes/cien_anos.jpg"),
    Book(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Las aventuras de un caballero idealista y su escudero.", "https://ejemplo.com/imagenes/don_quijote.jpg"),
    Book(3, "1984", "George Orwell", 1949, "Una distopía sobre un régimen totalitario y la vigilancia.", "https://ejemplo.com/imagenes/1984.jpg"),
    Book(4, "Orgullo y prejuicio", "Jane Austen", 1813, "Una historia de amor y clases sociales en la Inglaterra del siglo XIX.", "https://ejemplo.com/imagenes/orgullo_prejuicio.jpg"),
    Book(5, "El principito", "Antoine de Saint-Exupéry", 1943, "Un cuento filosófico sobre la vida y la amistad.", "https://ejemplo.com/imagenes/el_principito.jpg"),
    Book(6, "Fahrenheit 451", "Ray Bradbury", 1953, "Una sociedad donde los libros están prohibidos y se queman.", "https://ejemplo.com/imagenes/fahrenheit_451.jpg"),
    Book(7, "Crimen y castigo", "Fiódor Dostoyevski", 1866, "Un joven comete un asesinato y enfrenta las consecuencias morales.", "https://ejemplo.com/imagenes/crimen_castigo.jpg"),
    Book(8, "Matar a un ruiseñor", "Harper Lee", 1960, "Una niña presencia la injusticia racial en el sur de EE.UU.", "https://ejemplo.com/imagenes/matar_ruisenor.jpg"),
    Book(9, "La sombra del viento", "Carlos Ruiz Zafón", 2001, "Un joven descubre un libro maldito en la Barcelona de posguerra.", "https://ejemplo.com/imagenes/sombra_viento.jpg"),
    Book(10, "El nombre de la rosa", "Umberto Eco", 1980, "Un misterio medieval en una abadía benedictina.", "https://ejemplo.com/imagenes/nombre_rosa.jpg"),
    Book(11, "Rayuela", "Julio Cortázar", 1963, "Una novela experimental sobre la vida y el amor en París.", "https://ejemplo.com/imagenes/rayuela.jpg"),
    Book(12, "El señor de los anillos", "J.R.R. Tolkien", 1954, "Una épica aventura de fantasía en la Tierra Media.", "https://ejemplo.com/imagenes/senor_anillos.jpg"),
    Book(13, "La metamorfosis", "Franz Kafka", 1915, "Un hombre despierta transformado en un insecto gigante.", "https://ejemplo.com/imagenes/metamorfosis.jpg"),
    Book(14, "Pedro Páramo", "Juan Rulfo", 1955, "Un hombre busca a su padre en un pueblo fantasma.", "https://ejemplo.com/imagenes/pedro_paramo.jpg"),
    Book(15, "Los juegos del hambre", "Suzanne Collins", 2008, "Una joven lucha por sobrevivir en un reality show mortal.", "https://ejemplo.com/imagenes/juegos_hambre.jpg")
)
