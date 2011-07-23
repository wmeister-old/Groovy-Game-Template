import entity.ability.*

class Entity {
  ArrayList abilities = []
  Entity(ArrayList abilities) { // Ability Objects
    for(ability in abilities) { 
      this.abilities << ability
      def obj = this
      for(export in ability.exports) { 
	obj.metaClass[export.key] = export.value
      }
    }
  }
}