package com.digitalhouse.aula13.desafio

class ProfessorTitular( nome: String, sobrenome: String, tempoCasa: Int, codigo: Int, val especialidade: String): Professor(nome, sobrenome, tempoCasa, codigo) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}