package moviecrud.moviecrud.repository;

import moviecrud.moviecrud.model.Filme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmeRepository {
    private List<Filme> filmes = new ArrayList<>();

    public FilmeRepository() {
        filmes.add(new Filme("Stalker", "1979"));
        filmes.add(new Filme("Strange way of life", "2023"));
        filmes.add(new Filme("The Girl with the Dragon Tattoo", "2011"));
        filmes.add(new Filme("The Matrix", "1999"));
        filmes.add(new Filme("Inception", "2010"));
    }

    public void save(Filme filme) {
        System.out.println("SAVE - Recebendo o filme na camada de repositório");
        System.out.println(filme);
        filmes.add(filme);
    }

    public void update(Filme filme) {
        System.out.println("UPDATE - Recebendo o filme na camada de repositório");
        System.out.println(filme);

    }

    public void remove(String ano) {
        System.out.println(String.format("DELETE/ano - Recebendo o ano de lançamento: %s para excluir um filme", ano));
        System.out.println(ano);
    }

    public List<Filme> listAll() {
        System.out.println("LIST - Listando os filmes do sistema");

        List<Filme> filmesNaoRepetidos = new ArrayList<>(filmes);
        return filmesNaoRepetidos;
    }

    public Filme findByAno(String ano) {
        System.out.println(String.format("FIND/ano - Recebendo o ano: %s para localizar um filme", ano));
        for (Filme filme : filmes) {
            if (filme.getAno().equals(ano)) {
                return filme;
            }
        }
        return null;
    }
}