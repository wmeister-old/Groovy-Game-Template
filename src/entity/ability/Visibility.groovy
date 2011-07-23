package entity.ability;

class Visibility extends Ability { 
  boolean visible;
  Visibility(bool) { this.visible = bool }
  def toggle() { 
    (this.visible) ? hide() : show()
    this
  }
  def show() { 
    visible = true
    this
  }
  def hide() { 
    visible = false
    this
  }
}