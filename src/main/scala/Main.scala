object Main {
  // Question 01
  def filterEvenNumbers(sampleList:List[Int]):List[Int]={
    sampleList.filter((a: Int) => a%2==0)
  }

  // Question 2
  def calculateSquare(sampleList: List[Int]): List[Int] = {
    sampleList.map((a: Int) => a * a)
  }

  // Question 3
  def filterPrime(sampleList: List[Int]):List[Int] = {
    sampleList.filter(x => !((2 until x-1) exists (x % _ == 0)) && x > 1)
  }

  def main(args: Array[String]): Unit = {
    val myList1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Answer 1: "+filterEvenNumbers(myList1))

    val myList2 = List(1, 2, 3, 4, 5)
    println("Answer 2: "+calculateSquare(myList2))

    val myList3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Answer 3: "+filterPrime(myList3))
  }
}