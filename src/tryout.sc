case class Notes(name: String, duration: String, octave: Int)
val c3 = Notes("C", "Quarter", 3)
c3.name
c3.duration
c3.octave


sealed trait Symbol
case class Note(name: String, duration: String, octave: Int) extends Symbol
case class Rest(duration: String) extends Symbol


val symbol1: Symbol = Note("C", "Quarter", 3)
val symbol2: Symbol = Rest("Whole")


def symbolDuration(symbol: Symbol): String =
  symbol match {
    case Note(name, duration, octave) => duration
    case Rest(duration) => duration
  }


sealed trait Duration
case object Whole extends Duration
case object Half extends Duration
case object Quarter extends Duration

def fractionOfWhole(duration: Duration): Double =
  duration match {
    case Whole => 1.0
    case Half =>
      0.5

    case Quarter =>
      0.25

  }


println("welcome")

println("Hello, world!")

//var x = 1 + 1
//println(x)


//x = 3
//println(x)


val y: Int = 1 + 1

"Hello, " ++ "Scala!"
"Hello, Scala!".toUpperCase

-42.abs

"Hello, Scala!".size

1.to(10)

5.to(10)


3 + 2 == 3.+(2)


val myval = 1 to 10

println(myval)


16.toHexString

(0 to 10).contains(10)

"bar".take(2)

(0 until 10).contains(10)

0 until 10

0.until(10)

3.+(2)


val radius = 10

val pi = 3.14159

pi * radius * radius

radius



def square(x: Double) = x * x

def area(radius: Double): Double = 3.14159 * square(radius)

area(10)

def sumOfSquares(x: Double, y: Double) = square(x) + square(y)


sumOfSquares(1,1)

def abs(x: Double) = if (x >= 0) x else -x

abs(-5)




//def sqrtIte(guess: Double, x: Double): Double =
//  if (isGoodEnough(guess, x)) guess
//  else sqrtIter(improve(guess, x), x)


val x = 0
def f(y: Int) = y + 1
val result = {
  val x = f(3)
  x * x
} + x

result



def sqrt(x: Double) = {
  def sqrtIte(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIte(improve(guess))

  def improve(guess: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double) =
    abs(square(guess) - x) < 0.001

  sqrtIte(1.0)
}


sqrt(10)

