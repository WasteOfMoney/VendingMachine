package VendingMachine.State

import VendingMachine.Machine

class VendingClosed (vending: Machine) extends States {

  override def insertMoney(money: Int): Unit = {
    vending.totalMoney += money
  }

  override def selectSoda(): Boolean = {
    println("closed")
    false
  }

  override def selectSnack(): Boolean = {
    println("closed")
    false
  }

  override def selectChips(): Boolean = {
    println("closed")
    false
  }

  override def selectWater(): Boolean = {
    println("closed")
    false
  }

  override def moneyReturn(): Int = {
    vending.changeMoney = vending.totalMoney
    vending.totalMoney = 0
    vending.changeMoney
  }

  def MachineOpen(): Unit = ???

  def MachineClosed(): Unit = ???

}
