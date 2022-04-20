package br.com.alura.controller

import br.com.alura.dto.NovoTopicoForm
import br.com.alura.dto.TopicoView
import br.com.alura.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar():List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoForm) {
        service.cadastrar(dto)
    }
}