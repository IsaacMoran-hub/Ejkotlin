package Ejercicio2

class Inventario {
}

private var llistaInventario : ArrayList<Producto> = ArrayList()

fun addProduct(producto: Producto){
    llistaInventario.add(producto)
}

fun getProductos() : ArrayList<Producto>{        // funcion que va a devolver los la lista de Productos //
    return llistaInventario                      // Lo de después de los ":" Es el tipo de retorno de la funcion //
}

fun getProducto(id : Int) : Producto?{           // Le paso el id como parametro // Va a devolver el Producto y podria devolver null //
    for (producto in llistaInventario) {         // Operador " in " Por cada producto en la listaInventario y entonces hago el condicional//
        if (producto.id == id){                  // Si coincide el producto que esta mirando el bucle con el que buscamos devolvera ese producto //
            return producto                      // Sino devolvera null porque puede ser que la lista no tenga el ID que busco // Por eso pongo el "?" //
        }
    }
    return null
}


fun updateStock(id : Int, stock : Int) {
    llistaInventario.get(id).stock = stock
}


fun updatePrice(id : Int, preu : Float) {
    llistaInventario.get(id).preu = preu
    }
