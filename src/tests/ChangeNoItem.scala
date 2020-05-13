package tests

import VendingMachine.Machine

object ChangeNoItem {
  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(25)
    vending.moneyReturn()
    println(vending.totalMoney)
    println(vending.changeMoney)
  }
  //Water costs 2, returns 23 in change



}
