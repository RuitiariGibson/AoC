import day1.day1Part1
import day1.day1Part2
import utils.readFile


fun main() {
    val inputs = readFile("day_1.txt").map { it.toInt() }
    // thanks to reflection :XD
    ::day1Part1.call(inputs)
    ::day1Part2.call(inputs)

}




