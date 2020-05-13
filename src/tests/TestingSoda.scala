package tests

import VendingMachine.Machine

object TestingSoda {
  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(25)
    vending.selectSoda()
    println(vending.changeMoney)
  }
  //Soda costs 5, returns 20 in change
}
