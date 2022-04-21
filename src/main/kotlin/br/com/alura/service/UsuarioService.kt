package br.com.alura.service

import br.com.alura.model.Usuario
import br.com.alura.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(private val repository: UsuarioRepository) {

    fun buscarPorID(id: Long): Usuario {
        return repository.getById(id)
    }

}
