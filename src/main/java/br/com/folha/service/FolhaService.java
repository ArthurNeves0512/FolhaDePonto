package br.com.folha.service;

import br.com.folha.dto.FolhaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FolhaService {
    public Page<FolhaDTO> getPontos(String mes, Pageable pageable);
}
