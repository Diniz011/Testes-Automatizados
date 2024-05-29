package br.fiap.com.GestaoTrafego.controller;

import br.fiap.com.GestaoTrafego.model.Acidente;
import br.fiap.com.GestaoTrafego.service.AcidenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class AcidenteController<AcidenteDTO> {

    @Autowired
    private AcidenteService acidenteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Acidente salvar(@RequestBody Acidente acidente){
        return acidenteService.salvar(acidente);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Acidente buscarPeloId(@PathVariable Long id){
        return acidenteService.buscarAcidentePeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Acidente> listarTodos(){
        return acidenteService.listarTodosAcidentes();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        acidenteService.excluir(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Acidente> updateAcidente(@PathVariable Long id, @RequestBody AcidenteDTO acidenteDTO) {
        Acidente updatedAcidente = acidenteService.updateAcidente(id, acidenteDTO);
        return ResponseEntity.ok(updatedAcidente);
    }


}
