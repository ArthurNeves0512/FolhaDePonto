package br.com.folhaponto.web;

import br.com.folhaponto.entities.FolhaDePonto;
import br.com.folhaponto.entities.Funcionario;
import br.com.folhaponto.services.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController//isso indica que queremos retornar apenas valores JSON e nao  paginas hmtl por causa do @ResposeBody
@RequestMapping(path = "/funcionario")
@RequiredArgsConstructor
public class FuncionarioRest {

    private final FuncionarioService funcionarioService;

    @GetMapping(path = "/batidas")
    public ResponseEntity<FolhaDePonto> baterPonto(LocalDateTime localDateTime){
        ResponseEntity<FolhaDePonto> folhaDePontoResponseEntity= new ResponseEntity<FolhaDePonto>(HttpStatus.BAD_GATEWAY);
        return null;
    }

    @PutMapping(path = "/criar")
    public void criarFuncionario(Funcionario funcionario){

    }

    @GetMapping(path = "/a")
    public List<Funcionario> a(){
        return List.of(new Funcionario("Arthur", "estagiário"), new Funcionario("Rita", "irmã"));
    }
}
