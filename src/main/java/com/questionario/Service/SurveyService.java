package com.questionario.Service;

import com.questionario.models.Pergunta;
import com.questionario.models.Resposta;
import com.questionario.Repository.PerguntaRepository;
import com.questionario.Repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

    @Autowired
    private PerguntaRepository perguntaRepository;

    @Autowired
    private RespostaRepository respostaRepository;

    public List<Pergunta> listarPerguntas() {
        return perguntaRepository.findAllByAtivoTrue();
    }

    public void salvarResposta(Resposta resposta) {
        respostaRepository.save(resposta);
    }
}
