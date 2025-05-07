package com.example.bibliotecaduoc.services;
import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.bibliotecaduoc.repository.LibroRepository;
import java.util.List;


@Service
public class LibroService {
@Autowired

    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtneLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardaLibro(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "producto eliminado";
    }


    
    


}
