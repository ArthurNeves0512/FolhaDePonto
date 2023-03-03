package br.com.folha.service.impl;


import br.com.folha.dto.FuncionarioDTO;
import br.com.folha.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Annotation;

@Service("funcionarioService")
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    @Override
    public FuncionarioDTO vaiSefuder() {
        return null;
    }
}
