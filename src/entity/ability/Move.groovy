package entity.ability;

class Move extends Ability {
  int x, y;
  Move(x,y) {
    exports = ['moveTo':   { a,b -> to(a,b) },
               'position': { position()     }]
    to(x,y)
  }
  def to(int x, y) { 
    this.x = x
    this.y = y
    this
  }
  def position() {[ this.x, this.y ]}
}


