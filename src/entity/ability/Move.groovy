package entity.ability;

class Move extends Ability { 
  int x, y;
  Move(x,y) { to(x,y) }
  def to(x,y) {[ this.x = x, this.y = y ]}
  def position() {[ this.x, this.y ]} // TODO try to attach this to it's child class instead
}

// stick callbacks in instance variables/fields

