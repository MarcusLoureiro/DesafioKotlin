package com.digitalhouse.aula13.desafio

class Curso(val nome: String, val codigo: Int, var professorTitular: ProfessorTitular, var professorAdjunto: ProfessorAdjunto, val qtdMaximaAlunos: Int) {
    val listaAlunosMatriculados = mutableListOf<Aluno>()
    override fun equals(other: Any?): Boolean {
        return(other is Curso) && (codigo == other.codigo)
    }
    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(listaAlunosMatriculados.contains(umAluno)){
            return true
        }
        return false
    }
    fun excluirAluno(umAluno: Aluno){
        if(listaAlunosMatriculados.contains(umAluno)){
            listaAlunosMatriculados.remove(umAluno)
        }
    }
}