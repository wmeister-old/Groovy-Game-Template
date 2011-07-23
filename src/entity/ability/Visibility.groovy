package entity.ability;

abstract class Visibility extends Ability { 
  boolean visible = null
  def show() { 
    // TODO show it
    visible = true
  }
  def hide() { 
    // TODO hide it
    visible = false
  }
}