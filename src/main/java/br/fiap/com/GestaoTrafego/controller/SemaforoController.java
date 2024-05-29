package br.fiap.com.GestaoTrafego.controller;

import br.fiap.com.GestaoTrafego.model.Semaforo;
import br.fiap.com.GestaoTrafego.service.SemaforoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/semaforos")
public class SemaforoController<SemaforoDTO> {

    @Autowired
    private SemaforoService semaforoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Semaforo salvar(@RequestBody Semaforo semaforo) {
        return semaforoService.salvar(semaforo);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Semaforo buscarPeloId(@PathVariable Long id) {
        return semaforoService.buscarSemaforoPeloId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Semaforo> listarTodos() {
        return semaforoService.listarTodosSemaforos();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id) {
        semaforoService.excluir(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Semaforo> updateSemaforo(@PathVariable Long id, @RequestBody SemaforoDTO semaforoDTO) {
        Object SemaforoDTO = null;
        Semaforo updatedSemaforo = semaforoService.updateSemaforo(id, null);
        return ResponseEntity.ok(updatedSemaforo);
    }

}
