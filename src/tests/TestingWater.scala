package tests

import VendingMachine.Machine

object TestingWater {
  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(25)
    vending.selectWater()
    vending.selectChips()
    println(vending.totalMoney)
    println(vending.changeMoney)
    vending.selectChips()
  }
  //Water costs 2, returns 23 in change
}

