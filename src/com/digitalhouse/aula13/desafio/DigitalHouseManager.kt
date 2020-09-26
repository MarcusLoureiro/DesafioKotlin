package com.digitalhouse.aula13.desafio

import java.util.*

class DigitalHouseManager() {
    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessoresTitular = mutableListOf<ProfessorTitular>()
    val listaProfessoresAdjunto = mutableListOf<ProfessorAdjunto>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatriculas = mutableListOf<Matricula>()
    fun registrarCurso(nome: String, codigoCurso: Int, qtdMaxAlunos: Int) {
        val cursoNovo = Curso(nome, codigoCurso, qtdMaxAlunos)
        listaCursos.add(cursoNovo)
    }
    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaCursos) {
            if (curso.codigo == codigoCurso) {
                listaCursos.remove(curso)
                println("Curso de codigo ${curso.codigo} deletado!")
            }
        }
    }
    fun exibirCursos(){
        println("===========================================================================================")
        println("Lista de Cursos:")
        for (curso in listaCursos){
            println("Codigo: ${curso.codigo}")
            println("Nome: ${curso.nome}")
            println("Professor Titular: ${curso.professorTitular.nome} ${curso.professorTitular.sobrenome}")
            println("Professor Adjunto: ${curso.professorAdjunto.nome} ${curso.professorAdjunto.sobrenome}")
            println("Quantidade de alunos máxima: ${curso.qtdMaximaAlunos}")
        }
        println("===========================================================================================")
    }
    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, qtdHoras: Int) {
        val novoProfessor = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, qtdHoras)
        listaProfessoresAdjunto.add(novoProfessor)
    }
    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val novoProfessor = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaProfessoresTitular.add(novoProfessor)
    }
    fun exibirProfessores(){
        println("===========================================================================================")
        println("Lista de Professores:")
        for (professor in listaProfessoresAdjunto){
            println("Codigo: ${professor.codigo}")
            println("Nome: ${professor.nome} ${professor.sobrenome}")
        }
        for (professor in listaProfessoresTitular){
            println("Codigo: ${professor.codigo}")
            println("Nome: ${professor.nome} ${professor.sobrenome}")
        }
        println("===========================================================================================")
    }
    fun excluirProfessor(codigoProfessor: Int) {

        for (professor in listaProfessoresTitular) {
            if (professor.codigo == codigoProfessor) {
                listaProfessoresTitular.remove(professor)
                println("Professor de codigo ${professor.codigo} deletado!")
            }
        }
        for (professor in listaProfessoresAdjunto) {
            if (professor.codigo == codigoProfessor) {
                listaProfessoresAdjunto.remove(professor)
                println("Professor de codigo ${professor.codigo} deletado!")
            }
        }
    }
    fun alocarProfessor(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        for (curso in listaCursos) {
            if (curso.codigo == codigoCurso) {
                for (professor in listaProfessoresTitular) {
                    if (professor.codigo == codigoProfessorTitular) {
                        curso.professorTitular = professor
                    }
                }
                for (professor in listaProfessoresAdjunto) {
                    if (professor.codigo == codigoProfessorAdjunto) {
                        curso.professorAdjunto = professor
                    }
                }
            }
        }
    }
    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(novoAluno)
    }
    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var date = Date()
        var numerosMatriculados = 0
        for (curso in listaCursos) {
            if (curso.qtdMaximaAlunos > numerosMatriculados) {
                if (curso.codigo == codigoCurso) {
                    for (aluno in listaAlunos) {
                        if (aluno.codigo == codigoAluno) {
                            var alunoNovo = aluno
                            var novaMatricula = Matricula(aluno, curso, date)
                            listaMatriculas.add(novaMatricula)
                            println("O aluno(a): ${aluno.nome} ${aluno.sobreneome} foi matriculado(a) !")
                            numerosMatriculados = +1
                        }
                    }
                }
            } else {
                println("Aluno não pode ser matriculado neste curso, pois não existem vagas disponíveis!")
            }
        }
    }
    fun exibirMatriculas(){
        println("===========================================================================================")
        println("Lista de Matriculas:")
        for (matricula in listaMatriculas){
            println("Código Aluno(a): ${matricula.aluno.codigo}")
            println("Nome Aluno(a): ${matricula.aluno.nome} ${matricula.aluno.sobreneome}")
            println("Data da Matrícula: ${matricula.dataMatricula}")
        }
        println("===========================================================================================")
    }
    fun exibirAlunos(){
        println("===========================================================================================")
        println("Lista de Alunos:")
        for (aluno in listaAlunos){
            println("Codigo: ${aluno.codigo}")
            println("Nome: ${aluno.nome} ${aluno.sobreneome}")
        }
        println("===========================================================================================")
    }
}