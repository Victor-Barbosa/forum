package br.com.alura.mapper

import br.com.alura.dto.NovoTopicoForm
import br.com.alura.model.Topico
import br.com.alura.service.CursoService
import br.com.alura.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
): Mapper<NovoTopicoForm, Topico> {
    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorID(t.idCurso),
            autor = usuarioService.buscarPorID(t.idAutor)
        )
    }
}
