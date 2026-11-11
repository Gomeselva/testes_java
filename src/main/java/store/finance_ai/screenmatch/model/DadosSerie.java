package store.finance_ai.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import tools.jackson.databind.annotation.JsonAppend;

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons")Integer totalTemporadas,
                         @JsonAlias("imdbRating")String avaliacao) {
}
