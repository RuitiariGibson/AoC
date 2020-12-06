package day1

import utils.readFile


fun day1Part2(list:List<Int>) {
    /**
     * --- Part Two ---
    The Elves in accounting are thankful for your help; one of them even offers you a starfish coin they had left over from a past vacation.
    They offer you a second one if you can find three numbers in your expense report that meet the same criteria.
    Using the above example again, the three entries that sum to 2020 are 979, 366, and 675.
    Multiplying them together produces the answer, 241861950.
    In your expense report, what is the product of the three entries that sum to 2020? **/

    catersianProductPartTwo(list, list, list).first {
        val first = it.first
        val second = it.second
        val third = it.third
        val sum = first+second+third
        return@first  sum==2020
    }.also {
        println("${it.first*it.second*it.third}") }

}

private fun<A,B,C> catersianProductPartTwo(listA: Iterable<A>, listB: Iterable<B>,
listC:Iterable<C>):Sequence<Triple<A,B,C>> = sequence {
    listA.forEach {
        a->
        listB.forEach {
            b->
            listC.forEach { c->
                yield(Triple(a,b,c))
            }
        }
    }
}







