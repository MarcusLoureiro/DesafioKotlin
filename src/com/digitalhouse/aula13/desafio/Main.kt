package com.digitalhouse.aula13.desafio

fun main() {
    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarAluno("Marcus", "Loureiro", 55)
    digitalHouseManager.registrarAluno("Paula", "Acacio", 45)
    digitalHouseManager.registrarAluno("Maria", "Souza", 25)
    digitalHouseManager.registrarAluno("Felipe", "Sales", 15)
    digitalHouseManager.registrarAluno("Julia", "Torres", 5)

    digitalHouseManager.registrarProfessorTitular("Wagner", "Filho", 10,  "Android Studios")
    digitalHouseManager.registrarProfessorTitular("Jessica", "Correa", 20,  "Programação Orientada a Objetos")
    digitalHouseManager.registrarProfessorAdjunto("Vitória", "Gaspar", 30, 30, )
    digitalHouseManager.registrarProfessorAdjunto("João", "Borges", 40, 40, )

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessor(20001, 10, 30)
    digitalHouseManager.alocarProfessor(20002, 20, 40)

    digitalHouseManager.matricularAluno(55, 20001)
    digitalHouseManager.matricularAluno(45, 20001)
    digitalHouseManager.matricularAluno(25, 20001)
    digitalHouseManager.matricularAluno(15, 20002)
    digitalHouseManager.matricularAluno(5, 20002)


    /*digitalHouseManager.exibirCursos()
    digitalHouseManager.exibirAlunos()
    digitalHouseManager.exibirProfessores()
    digitalHouseManager.exibirMatriculas()
     */
    /*
    Teste para verificar se o professor foi deletado, resultado foi positivo.
    digitalHouseManager.excluirProfessor(10)
    digitalHouseManager.exibirProfessores()
     */
    /*
    Teste para verificar se o curso foi deletado, resultado foi positivo.
    digitalHouseManager.excluirCurso(20001)
    digitalHouseManager.exibirCursos()
     */
}