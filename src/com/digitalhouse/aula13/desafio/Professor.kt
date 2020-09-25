package com.digitalhouse.aula13.desafio

open class Professor(val nome: String, val sobrenome: String, var tempoCasa: Int, val codigo: Int) {
    override fun equals(other: Any?): Boolean {
        return(other is Professor) && (codigo == other.codigo)
    }
}