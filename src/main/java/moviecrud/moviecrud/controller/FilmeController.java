package moviecrud.moviecrud.controller;


import moviecrud.moviecrud.model.Filme;
import moviecrud.moviecrud.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes") // Define a raiz URL para todas as operações relacionadas a filmes

public class FilmeController {
    @Autowired
    private FilmeRepository repository;

    @PostMapping
    public void post(@RequestBody Filme filme) {
        repository.save(filme);
    }

    @PutMapping
    public void put(@RequestBody Filme filme) {
        repository.update(filme);
    }

    @GetMapping
    public List<Filme> getAll() {
        return repository.listAll();
    }

    @GetMapping("/{ano}")
    public Filme getOne(@PathVariable("ano") String ano) {
        return repository.findByAno(ano);
    }

    @DeleteMapping("/{ano}")
    public void delete(@PathVariable("ano") String ano) {
        repository.remove(ano);
    }
}