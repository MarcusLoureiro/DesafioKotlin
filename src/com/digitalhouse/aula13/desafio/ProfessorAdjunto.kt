package com.digitalhouse.aula13.desafio

class ProfessorAdjunto(nome: String, sobrenome: String, tempoCasa: Int, codigo: Int, qtdMonitoria: String): Professor(nome, sobrenome, tempoCasa, codigo) {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}