package VendingMachine.State

abstract class States {

  def insertMoney(money: Int): Unit

  def selectSoda(): Boolean

  def selectSnack(): Boolean

  def selectChips(): Boolean

  def selectWater(): Boolean

  def moneyReturn(): Int

  def MachineOpen(): Unit

  def MachineClosed(): Unit


}