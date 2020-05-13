package VendingMachine

import VendingMachine.State.{States, VendingClosed, VendingOpen}

class Machine {

  var States: States = new VendingOpen(this)
  var totalMoney: Int = 0
  var changeMoney: Int = 0

  def insertMoney(money: Int): Unit = {
    this.States.insertMoney(money)
  }

  def selectSoda(): Boolean = {
    this.States.selectSoda()
  }

  def selectSnack(): Boolean = {
    this.States.selectSnack()
  }

  def selectChips(): Boolean = {
    this.States.selectChips()
  }

  def selectWater(): Boolean = {
    this.States.selectWater()
  }

  def moneyReturn(): Int = {
    this.States.moneyReturn()
  }

  def MachineOpen(): Unit = this.States = new VendingOpen(this)

  def MachineClosed(): Unit = this.States = new VendingClosed(this)

}
