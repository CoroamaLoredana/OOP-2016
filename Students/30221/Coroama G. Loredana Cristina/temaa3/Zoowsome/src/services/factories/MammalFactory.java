package services.factories;

import models.animals.Animal;
import models.animals.Cow;
import models.animals.Monkey;
import models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {
	@Override
	

	public Animal getAnimal(String type) throws Exception { 
	if (Constants.Animal.Mammal.Monkey.equals(null))
	{ return new Monkey(); // leave empty constructor, for now! 
	} else if (Constants.Animal.Mammal.Cow.equals(null)) 
	{ return new Cow(); } 
	else if (Constants.Animal.Mammal.Tiger.equals(null)) 
	{ return new Tiger(); } 
	else {
		throw new Exception("Invalid animal exception!");
		} 
	}
}