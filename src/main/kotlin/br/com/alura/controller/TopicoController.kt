package br.com.alura.controller

import br.com.alura.dto.NovoTopicoDto
import br.com.alura.model.Topico
import br.com.alura.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar():List<Topico> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoDto) {
        service.cadastrar(dto)
    }
}