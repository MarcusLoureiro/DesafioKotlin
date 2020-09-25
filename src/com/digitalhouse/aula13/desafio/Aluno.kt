package com.digitalhouse.aula13.desafio

class Aluno (val nome: String, val sobreneome: String, val codigo: Int){

    override fun equals(other: Any?): Boolean {
        return(other is Aluno) && (codigo == other.codigo)
    }
}