fun main(args: Array<String>) {
    var nome: String = ""
    var idade: Int = 0
    var prefDeEmprego: String = ""
    var nacionalidade: String = ""
    var tipoSanguineo: String = ""
    var ano = 2021

    print("Digite seu nome: ")
    nome = readLine()!!
    print("Digite a sua idade: ")
    idade = readLine()!!.toInt()
    print("Digite a sua preferencia de emprego: ")
    prefDeEmprego = readLine()!!
    print("Digite a sua nacionalidade: ")
    nacionalidade = readLine()!!
    print("Digite o seu tipo sanguíneo: ")
    tipoSanguineo = readLine()!!

    var anoNasc = ano - idade

    println("$nome tem $idade de idade, tem preferência no cargo de $prefDeEmprego," +
    " sua nacionalidade é $nacionalidade e seu tipo sanguíneo é $tipoSanguineo. " +
            "Além de ter nascido no ano de $anoNasc")
}

