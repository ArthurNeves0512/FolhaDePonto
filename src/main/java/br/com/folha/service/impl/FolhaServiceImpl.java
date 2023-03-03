package br.com.folha.service.impl;

import br.com.folha.dto.FolhaDTO;
import br.com.folha.service.FolhaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import br.com.folha.Repositories.FolhaRepository;
@Service
public class FolhaServiceImpl implements FolhaService {
    private FolhaRepository repository;
    @Override
    public Page<FolhaDTO> getPontos(String mes, Pageable pageable){
        return repository.folhaDoMes(mes,  pageable);
    }
}
