package com.example.persona.services;

import com.example.persona.entities.Libro;
import com.example.persona.repositories.LibroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements BaseService<Libro> {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    @Transactional
    public List<Libro> findAll() throws Exception {
        try {
            return libroRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Libro findById(Long id) throws Exception {
        try {
            Optional<Libro> entityOptional = libroRepository.findById(id);
            return entityOptional.orElseThrow(() -> new Exception("No encontrado"));
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Libro save(Libro entity) throws Exception {
        try {
            return libroRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Libro update(Long id, Libro entity) throws Exception {
        try {
            Optional<Libro> entityOptional = libroRepository.findById(id);
            Libro libro = entityOptional.orElseThrow(() -> new Exception("No encontrado"));
            libro.setTitulo(entity.getTitulo());
            libro.setGenero(entity.getGenero());
            libro.setAutor(entity.getAutor());
            return libroRepository.save(libro);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (libroRepository.existsById(id)) {
                libroRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No encontrado");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
