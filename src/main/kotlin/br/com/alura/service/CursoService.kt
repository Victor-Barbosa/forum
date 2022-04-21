package br.com.alura.service

import br.com.alura.model.Curso
import br.com.alura.repository.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoService(private val repository: CursoRepository) {

    fun buscarPorID(id: Long): Curso {
        return repository.getById(id)
    }
}
