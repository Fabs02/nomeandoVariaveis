fun main(args: Array<String>) {
    var nome: String = ""
    var idade: Int = 0
    var prefDeEmprego: String = ""
    var nacionalidade: String = ""
    var tipoSanguineo: String = ""

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

    println("$nome tem $idade de idade, tem preferência no cargo de $prefDeEmprego," +
    " sua nacionalidade é $nacionalidade e seu tipo sanguíneo é $tipoSanguineo")
}

