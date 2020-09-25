package com.digitalhouse.aula13.desafio

open class Professor(val nome: String, val sobrenome: String, var tempoCasa: Int, val codigo: Int) {
    open override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}