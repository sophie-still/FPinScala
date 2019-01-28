import fpinscala.datastructures.Cons

import scala.collection.immutable.Stream.cons

def isSorted[A](array: Array[A], ordered: (A,A) => Boolean): Boolean =
{
  if (array.isEmpty) true
  else{
  def compareArrayElements(n:Int): Boolean = {
    if (n >= array.length-1) true
    else if (ordered(array(n+1),array(n))) {compareArrayElements(n+1)}
    else false
  }
  compareArrayElements(0)}
}



isSorted[Int](Array(1,2,3,4,5), _ > _ )
isSorted[Int](Array(1), _ > _)
isSorted[Int](Array(), _ > _ )
isSorted[Int](Array(5,4,3,2,1), _ > _)
isSorted[String](Array("a","ab","abc"), _.length < _.length)
isSorted[String](Array("abc","ab","a"), _.length < _.length)
