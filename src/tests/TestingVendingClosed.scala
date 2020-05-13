package tests

import VendingMachine.Machine

object TestingVendingClosed {
  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {
    vending.MachineClosed()

    vending.insertMoney(20)
    vending.selectChips()

    println(vending.totalMoney)
    println(vending.changeMoney)
  }
  //Vending Machine Closed. Gives you no change. You have 20 in total money
}
