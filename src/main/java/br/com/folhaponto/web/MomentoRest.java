package br.com.folhaponto.web;


import br.com.folhaponto.entities.FolhaDePonto;
import br.com.folhaponto.services.FolhaDePontoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class MomentoRest {

    private final FolhaDePontoService folhaDePontoService;

    @PostMapping(path = "/batidas")
    public ResponseEntity<FolhaDePonto> baterPonto(LocalDateTime localDateTime){
        return null;
    }
}
