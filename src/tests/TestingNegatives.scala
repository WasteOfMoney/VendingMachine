package tests

import VendingMachine.Machine

object TestingNegatives {
  val vending: Machine = new Machine

  def main(args: Array[String]): Unit = {

    vending.insertMoney(-25)
    vending.selectSnack()
    println(vending.totalMoney)
    println(vending.changeMoney)
  }
  //Snack cost 20, returns total of -25
}
