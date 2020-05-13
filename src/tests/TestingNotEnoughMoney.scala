package tests

import VendingMachine.Machine

object TestingNotEnoughMoney {

  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(0)
    vending.selectChips()
    println(vending.totalMoney)
    println(vending.changeMoney)
    println(vending.selectChips())
  }
  //Chips costs 10, returns 0 in change and false
}
