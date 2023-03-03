package br.com.folha.web;

import br.com.folha.dto.FolhaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.folha.service.FolhaService;

@RestController
public class FolhaRest {
    private FolhaService service;
    @GetMapping(value = "/folha")
    public Page<FolhaDTO> getFolhaDePonto(String mes, Pageable pageable){
        return service.getPontos( mes, pageable);
    }
}
