class Player extends Character {
      // WARNING: instance is not thread safe
      // def foo = 1
      private static final INSTANCE = new Player()
      static getInstance() { return INSTANCE }
      // def bar { 1 }
}