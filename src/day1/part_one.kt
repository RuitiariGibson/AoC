package day1

import utils.readFile

fun day1Part1(inputs:List<Int>){
    lazyCartesianProductPartOne(inputs, inputs).first {
        val first = it.first
        val second = it.second
        return@first (second+first)==2020
    }.also {
        println("${it.first*it.second}") }
}
private fun <A, B> lazyCartesianProductPartOne(listA:Iterable<A>,
                                               listB:Iterable<B>):Sequence<Pair<A,B>> = sequence {
    listA.forEach { a->
        listB.forEach { b->
            yield(a to b)
        }
    }
}
// second way of doing part one
/* array.mapNotNull {
      //val sumToFind = 2020-it
      if (array.contains(2020-it)){
          val x = 2020-it
          println(it)
          // it*(2020-it)
      }
  }*/