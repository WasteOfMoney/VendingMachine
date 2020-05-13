package tests

import VendingMachine.Machine

object TestingSnacks {

  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(25)
    vending.selectSnack()
    println(vending.totalMoney)
    println(vending.changeMoney)
  }
  //Snack costs 20, returns 5 in change
}
