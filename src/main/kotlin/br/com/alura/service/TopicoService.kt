package br.com.alura.service

import br.com.alura.model.Curso
import br.com.alura.model.Topico
import br.com.alura.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService {
    fun listar(): List<Topico> {
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis no kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "João da silva",
                email = "joao@email.com"
            )
        )

        return listOf(topico, topico, topico)
    }
}