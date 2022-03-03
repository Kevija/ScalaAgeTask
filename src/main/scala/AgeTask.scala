import java.time.Year
import scala.io.StdIn.readLine

// Write an application that asks for person's name and their age

object AgeTask {

  object Day3AgeCalculatorEK extends App {
    val year = Year.now.getValue
    val personName = readLine("What is your name?")
    println(s"Hello $personName!")
    val personAge = readLine("How old are you?")
    val hundredYears = year - personAge.toInt + 99
    println(s"Great, you will be 100 years old in $hundredYears!")

  }

}
