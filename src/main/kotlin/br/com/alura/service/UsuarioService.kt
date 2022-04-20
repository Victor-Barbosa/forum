package br.com.alura.service

import br.com.alura.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "joao",
            email = "joao@email.com"
        )
        usuarios = listOf(usuario)
    }

    fun buscarPorID(id: Long): Usuario {
        return usuarios.stream().filter { c -> c.id == id }.findFirst().get()
    }

}
