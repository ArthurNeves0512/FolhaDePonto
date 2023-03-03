package br.com.folha.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class FolhaDTO {

    private ZonedDateTime pontoChegada;
    private ZonedDateTime pontoFnal;
    private LocalDateTime horasTotaisDia;
    private LocalDateTime horasTotaisMes;

    public FolhaDTO(ZonedDateTime pontoChegada, ZonedDateTime pontoFnal, LocalDateTime horasTotaisDia){
        this.horasTotaisDia = horasTotaisDia;
        this.pontoFnal = pontoFnal;
        this.pontoChegada = pontoChegada;
    }



}
