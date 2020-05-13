package tests

import VendingMachine.Machine

object MultipleItems {
  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(25)
    vending.selectChips()
    println(vending.totalMoney)
    vending.selectSoda()
    println(vending.changeMoney)
  }
  //Water costs 2, returns 23 in change



}
