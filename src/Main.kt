fun main() {

    val map = mapOf(
        0 to "Alex", 1 to "Ivan", 2 to "Irina", 3 to "Oleg", 4 to "Sergei",
        5 to "Olga", 6 to "Igor", 7 to "Александра", 8 to "Григорий"
    )
    println(map)
    println()

    /*
    Дан map, в которой элементы содержат ключ целое число, значения имена.
    Отфильтруйте ее по значению ключа, допустим, менее значения равного 5.
    */
    println(map.filterKeys { it < 5 })
    println()

    /*
    Дан map, в которой элементы содержат ключ целое число, значения имена.
    Отфильтруйте по значениям, оканчивающимся на букву «а».
    */
    println(map.filterValues { it.last() == 'а' })
    println()

    /*
    Дан map, в которой элементы содержат ключ целое число, значения имена.
    Отфильтруйте по значениям, Начинающимся на букву «Г».
    */
    println(map.filterValues { it.first() == 'Г' })
    println()

    /*
    Дан map prizeMap, описывающий ключом порядковый номер сотрудника, значение характеризует процент премии сотруднику.
    Отфильтровать исходный map с таким расчетом, чтобы получить данные сотрудников,
    чей порядковый номер оканчивается на «5» и процент премии больше 20.
    */
    val prizeMap = mapOf(
        0 to 30, 1 to 40, 2 to 30, 3 to 10, 4 to 0,
        5 to 15, 6 to 25, 7 to 20, 8 to 10, 15 to 25
    )
    println(prizeMap)
    println(
        prizeMap
        .filterKeys { it.toString().last() == '5' }
        .filterValues { it > 20 })

}







