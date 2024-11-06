fun main() {

    //Задача 1
    val list = listOf("Арбуз", "Персик", "Апельсин", "Груша", "Перец")
    println("Пример выполнения решения для задачи 1:\n" + groupByFirstLetter(list))

    //Задача 2
    val list2 = listOf("12", "34", "567", "89", "012")
    println("Пример выполнения решения для задачи 2:\n" + groupByStringLength(list2))

    //Задача 3
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    println("Пример выполнения решения для задачи 3:")
    groupByYear(phoneToYear).forEach {
        println(it.key)
        it.value.forEach { pair ->  println(pair.first) }
    }
}

//Функция для задачи 1
fun groupByFirstLetter(list: List<String>) = list.groupBy { it.first() }

//Функция для задачи 2
fun groupByStringLength(list: List<String>) = list.groupBy { it.length }

//Функция для задачи 3
fun groupByYear(list: List<Pair<String, Int>>) = list.groupBy { it.second }