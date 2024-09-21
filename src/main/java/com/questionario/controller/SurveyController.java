package com.questionario.controller;

import com.questionario.models.Pergunta;
import com.questionario.models.Resposta;
import com.questionario.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pesquisa")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/perguntas")
    public ResponseEntity<List<Pergunta>> listarPerguntas() {
        List<Pergunta> perguntas = surveyService.listarPerguntas();
        if (perguntas.isEmpty()) {
            return ResponseEntity.noContent().build(); // Retorna 204 se não houver perguntas
        }
        return ResponseEntity.ok(perguntas);
    }

    @PostMapping("/responder")
    public ResponseEntity<String> responderPergunta(@RequestBody Resposta resposta) {
        // Remover o ID da pesquisa
        surveyService.salvarResposta(resposta);
        return ResponseEntity.ok("Resposta salva com sucesso!");
    }
}
