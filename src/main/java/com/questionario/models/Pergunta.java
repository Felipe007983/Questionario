package com.questionario.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Perguntas") // Nome da tabela no banco de dados
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "textoPergunta")
    private String textoPergunta;

    @Column(nullable = false)
    private Boolean ativo = true;

    public Pergunta() {}

    public Pergunta(String textoPergunta) {
        this.textoPergunta = textoPergunta;
        this.ativo = true;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextoPergunta() {
        return textoPergunta;
    }

    public void setTextoPergunta(String textoPergunta) {
        this.textoPergunta = textoPergunta;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
