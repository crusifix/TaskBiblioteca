package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }
    
    // buscar un libro por su id
    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro; 
            }

            
        }
        
        return null;

    }

    
    //buscar un libro por su ISBN
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro; 
            }
        }
        return null;
    }

    public Libro guardar(Libro lib) {
        listaLibros.add(lib);
        return lib;
    }

    public Libro actualizar(Libro lib) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }
        }
    }

    // eliminar un libro por su id
    public void eliminar(int id) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            listaLibros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
        } else {
            System.out.println("No se encontró el libro con id: " + id);
        }
    }



    Libro libro1 = new Libro();
    libro1.setId(id);
    libro1.setTitulo(lib.getTitulo());
    libro1.setAutor(lib.getAutor());
    libro1.setFechaPublicacion(lib.getFechaPublicacion());
    libro1.setEditorial(lib.getEditorial());
    libro1.setIsbn(lib.getIsbn());

    listaLibros.set(idPosicion, libro1);
    return libro1;
    


    

}


}