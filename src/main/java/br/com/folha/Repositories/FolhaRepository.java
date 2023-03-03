package br.com.folha.Repositories;

import br.com.folha.Entidades.Folha;
import br.com.folha.dto.FolhaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface FolhaRepository extends JpaRepository<Folha, Long> {

    String FOLHA_DO_MES = "SELECT new br.com.folha.dto.FolhaDTO( f.pontoInicio, f.pontoFinal, f.HorasTrabalhadas) FROM Folha f" +
            " WHERE f.mes =:folhaMes";

    @Query(FOLHA_DO_MES)
    public Page<FolhaDTO> folhaDoMes(@Param("folhaMes") String folhaMes, Pageable pageable);
}
