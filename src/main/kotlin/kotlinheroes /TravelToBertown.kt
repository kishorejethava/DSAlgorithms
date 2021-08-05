fun main() {
    val numberCases = readLine()!!.toInt()
    val list = ArrayList<Int>()
    for (i in 1..numberCases) {
        val (totalFriends, dayCame) = readLine()!!.split(" ").map { it.toInt() }
        list.clear()
        (0 until totalFriends).forEach { _ ->
            val (startDay, endDay) = readLine()!!.split(" ").map { it.toInt() }
            if(dayCame in startDay..endDay){
                list.add((endDay - dayCame) + 1)
            }
        }
        if(list.isEmpty())
            println(0)
        else
            println(list.maxOrNull()?:0)
    }
}

