package br.com.folhaponto.repositories;

import br.com.folhaponto.entities.FolhaDePonto;
import br.com.folhaponto.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface FolhaDePontoRepository extends JpaRepository<FolhaDePonto, Funcionario> {


}
