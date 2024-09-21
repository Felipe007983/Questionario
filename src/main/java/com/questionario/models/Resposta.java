package com.questionario.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Respostas") // Nome da tabela no banco de dados
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idPergunta", nullable = false)
    private Pergunta pergunta;

    @Column(nullable = false)
    private String nomeGestor;

    @Column(nullable = false)
    private int resposta;

    @Column(nullable = false)
    private LocalDateTime dataResposta = LocalDateTime.now();

    public Resposta() {}

    public Resposta(Pergunta pergunta, String nomeGestor, int resposta) {
        this.pergunta = pergunta;
        this.nomeGestor = nomeGestor;
        this.resposta = resposta;
        this.dataResposta = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public String getNomeGestor() {
        return nomeGestor;
    }

    public void setNomeGestor(String nomeGestor) {
        this.nomeGestor = nomeGestor;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public LocalDateTime getDataResposta() {
        return dataResposta;
    }

    public void setDataResposta(LocalDateTime dataResposta) {
        this.dataResposta = dataResposta;
    }
}
