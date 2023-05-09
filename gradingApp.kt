fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47

  // Write your code below
 
  //Question 1
  println("Solve: 75 / 5?")
  var studentAnswer1 = Integer.valueOf(readLine())

  //Question 2
  println("Solve for y: 6 * 2y = 36")
  var studentAnswer2 = Integer.valueOf(readLine())

  //Question 3
  println("What type of triangle has two equal sides?")
  var studentAnswer3 = readLine()

  //Question 4
  println("Solve: 8 * 6 - (3 - 2)")
  var studentAnswer4 = Integer.valueOf(readLine())
  
  //Declaring grade points
  var points = 0
  
  // grade q1
  if (studentAnswer1 == quizAnswer1) {
    points += 25
  }
  
  // grade q2
  if (studentAnswer2 == quizAnswer2) {
    points += 25
  } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
    points += 20
  } else {
    points++
  }

  //grade q3
  if (studentAnswer3 == quizAnswer3) {
    points += 25
  } else if (studentAnswer3 == "equilateral") {
    points += 10
  } else {
    points++
  }

  // grade q4
  if (studentAnswer4 == quizAnswer4) {
    points += 25
  } else if (studentAnswer4 in 44..54) {
    points += 20
  } else {
    points++
  }

  // outputs grade
  when (points) {
    in 0..59 -> println("F $points")
    in 60..69 -> println("D $points")
    in 70..79 -> println("C $points")
    in 80..89 -> println("B $points")
    in 90..100 -> println("A $points")
    in 101..110 -> println("A+ $points")
  }
}
