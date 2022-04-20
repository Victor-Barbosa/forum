package br.com.alura.service

import br.com.alura.dto.AtualizacaoTopicoForm
import br.com.alura.dto.NovoTopicoForm
import br.com.alura.dto.TopicoView
import br.com.alura.mapper.TopicoFormMapper
import br.com.alura.mapper.TopicoViewMapper
import br.com.alura.model.Topico
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { topico -> topicoViewMapper.map(topico) }
                        .collect(Collectors.toList())
    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t-> t.id == id}
                                .findFirst().get()
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(form: NovoTopicoForm) {
        val topico =  topicoFormMapper.map(form)
        topico.id= topicos.size.toLong() +1
        topicos = topicos.plus(topico)
    }

    fun atualizar(form: AtualizacaoTopicoForm) {
        val topico = topicos.stream().filter { t-> t.id == form.id}
            .findFirst().get()
        topicos = topicos.minus(topico).plus(
            Topico(
            id = form.id,
            titulo = form.titulo,
            mensagem = form.mensagem,
            autor = topico.autor,
            curso = topico.curso,
            respostas = topico.respostas,
            status = topico.status,
            dataCriacao = topico.dataCriacao
        ))
    }
}