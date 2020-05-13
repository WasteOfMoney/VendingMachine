package tests

import VendingMachine.Machine

object NoItem {
  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(25)
    println(vending.totalMoney)
    println(vending.changeMoney)
  }
  //No item Selected. Receive no change. You still have 20.
}
