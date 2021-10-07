fun main() {

    //hashset has unique elements and ascending filtered
    println("\n\nhashset")
    val hashSet = hashSetOf(0, 8, 9, 6, 5, 4, 4, 0)
    hashSet.forEach {
        println(it)
    }
    //set has unique elements
    println("\n\nset")
    val set = setOf(0, 8, 9, 6, 5, 4, 4, 0)
    set.forEach {
        println(it)
    }

    println("\n\nlist")
    val list = listOf("Ahmad", "Mohammed", "Ali")
    for (i in list) {
        println(i)
    }

    println("\n\nmutableList")
    val mlist = mutableListOf("Ahmad", "Mohammed", "Ali")
    mlist.add("Eman")
    mlist.add("Jamal")
    mlist.remove("Ahmad")
    mlist.removeAt(1)

    for (i in mlist) {
        println(i)
    }

    println("\n\nmap")
    //map is immutable, so you can't add new elements
    val map = mapOf<String, Any>("name" to "Muath Nassar", "age" to 28, "faculty" to "IT")
    println(
        """
            Teacher name : ${map["name"]}
            Age : ${map["age"]}
            faculty : ${map["faculty"]}
        """.trimIndent()
    )

    println("\n\nmutableMap")
    //mutableMap is mutable, so you can add new elements
    val mMap = mutableMapOf<String, Any>("name" to "Muath Nassar", "age" to 28, "faculty" to "IT")
    mMap["university"] = "IUG "
    mMap["university"] = "Azhar"
    println(
        """
            Teacher name : ${mMap["name"]}
            Age : ${mMap["age"]}
            Faculty : ${mMap["faculty"]}
            University : ${
            mMap["university"]
        }
            MUTABLE_MAP size = ${mMap.size}
        """.trimIndent()
    )


    //*******************************************
    /*
    fun minMax(numbers: Array<Int>): Pair<Int, Int>?
     */
    fun minMax(numbers: Array<Int>): Pair<Int, Int>? {
        if (numbers.isEmpty()) {
            return null
        } else {
            var max = numbers[0]
            var min = numbers[0]
            for (i in numbers) {
                if (i > max) {
                    max = i
                }
                if (i < min) {
                    min = i
                }
            }
            return Pair(min, max)
        }
    }

    minMax(arrayOf(5, 6, 8, 2, 55, 4, -20, 0, 25, 7459, 52, 11))?.let {
        println("max = " + it.second + " min = " + it.first)
    }
    //fun remove(item: Int, list: List<Int>): List<Int>

    fun remove(item: Int, list: List<Int>): List<Int> {
        val mList = list.toMutableList()
        for (i in list) {
            if (i != item) mList.add(i)
        }
        return mList
    }
    remove(5, listOf(4, 5, 5, 4, 1, 22, 5, 5, 6, 8)).onEach { num ->
        println(num)
    }
}