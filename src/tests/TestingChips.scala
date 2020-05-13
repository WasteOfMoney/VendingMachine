package tests

import VendingMachine._

object TestingChips {

  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(25)
    vending.selectChips()
    println(vending.totalMoney)
    println(vending.changeMoney)
  }
  //Chips costs 10, returns 15 in change
}
