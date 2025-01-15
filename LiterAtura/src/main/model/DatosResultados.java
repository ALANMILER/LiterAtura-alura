package com.aluracursos.literalura.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosResultados(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutor> autorList,
        @JsonAlias("languages") List<String> language,
        @JsonAlias("download_count") Integer descargas
) {

}
