package VendingMachine.State

import VendingMachine.Machine

class VendingOpen (vending: Machine) extends States {

  override def insertMoney(money: Int): Unit = {
    vending.totalMoney += money
  }

  override def selectSoda(): Boolean = {
    if (vending.totalMoney >= 5){
      vending.totalMoney -= 5
      this.moneyReturn()
      true
    } else {
      false
    }
  }

  override def selectSnack(): Boolean = {
    if (vending.totalMoney >= 20){
      vending.totalMoney -= 20
      this.moneyReturn()
      true
    } else {
      false
    }
  }

  override def selectChips(): Boolean = {
    if (vending.totalMoney >= 10){
      vending.totalMoney -= 10
      this.moneyReturn()
      true
    } else {
      false
    }
  }

  override def selectWater(): Boolean = {
    if (vending.totalMoney >= 2){
      vending.totalMoney -= 2
      this.moneyReturn()
      true
    } else {
      false
    }
  }

  override def moneyReturn(): Int = {
    vending.changeMoney = vending.totalMoney
    vending.totalMoney = 0
    vending.changeMoney
  }

  def MachineOpen(): Unit = ???

  def MachineClosed(): Unit = ???

}
