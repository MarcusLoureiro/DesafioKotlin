package com.digitalhouse.aula13.desafio

import java.util.*

class DigitalHouseManager() {
    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessoresTitular = mutableListOf<ProfessorTitular>()
    val listaProfessoresAdjunto = mutableListOf<ProfessorAdjunto>()
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
        listaProfessoresAdjunto.add(novoProfessor)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val novoProfessor = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaProfessoresTitular.add(novoProfessor)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (professor in listaCursos) {
            if (professor.codigo == codigoProfessor) {
                listaProfessoresTitular.remove(professor)
            }
        }
        for (professor in listaCursos) {
            if (professor.codigo == codigoProfessor) {
                listaProfessoresAdjunto.remove(professor)
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
            if (curso.qtdMaximaAlunos < numerosMatriculados) {
                if (curso.codigo == codigoCurso) {
                    for (aluno in listaAlunos) {
                        if (aluno.codigo == codigoAluno) {
                            var alunoNovo = aluno
                            var novaMatricula = Matricula(aluno, curso, date)
                            listaMatriculas.add(novaMatricula)
                            numerosMatriculados = +1
                        }
                    }
                }
            } else {
                println("Aluno não pode ser matriculado neste curso, pois não existem vagas disponíveis!")
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
}