package entity.ability;

class Move extends Ability { 
  int x; int y;
  Move(x,y) { moveTo(x,y) }
  def positon() { [x,y] }
  def moveTo(nx,ny) { x = nx; y = ny; [nx,ny] }
}