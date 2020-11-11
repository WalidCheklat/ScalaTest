package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ? => Warning: a pure expression does nothing in statement position; multiline expressions may require enclosing parentheses
  Supporter.support //What does this print and why ? How to fix it ? => It prints the same warning
}
