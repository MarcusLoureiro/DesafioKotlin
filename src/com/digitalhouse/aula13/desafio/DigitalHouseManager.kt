package com.digitalhouse.aula13.desafio

import java.util.*

class DigitalHouseManager() {
    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessores = mutableListOf<Professor>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxAlunos: Int, professorAdjunto: ProfessorAdjunto, professorTitular: ProfessorTitular) {
        val cursoNovo = Curso(nome, codigoCurso, professorTitular, professorAdjunto, qtdMaxAlunos)
        listaCursos.add(cursoNovo)
    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaCursos) {
            if (curso.codigo == codigoCurso) {
                listaCursos.remove(curso)
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qtdHoras: Int) {
        val novoProfessor = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, qtdHoras)
        listaProfessores.add(novoProfessor)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val novoProfessor = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaProfessores.add(novoProfessor)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (professor in listaCursos) {
            if (professor.codigo == codigoProfessor) {
                listaProfessores.remove(professor)
            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(novoAluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var alunoNovo: Aluno
        var cursoNovo: Curso
        var data = Date()
        for(aluno in listaAlunos){
            if(aluno.codigo == codigoAluno){
                 alunoNovo = aluno
            }
        }
        for(curso in listaCursos){
            if(curso.codigo == codigoCurso)
                 cursoNovo = curso
        }
    }
}