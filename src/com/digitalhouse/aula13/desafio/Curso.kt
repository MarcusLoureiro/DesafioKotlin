package com.digitalhouse.aula13.desafio

class Curso(val nome: String, val codigo: Int, val professorTitular: ProfessorTitular, val professorAdjunto: ProfessorAdjunto, val qtdMaximaAlunos: Int, listaAlunosMatriculados: MutableList<Aluno>) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        TODO( "Implementar método ")
    }
    fun excluirAluno(umAluno: Aluno){
        
    }
}