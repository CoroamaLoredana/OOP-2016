package services.factories;


import models.animals.Animal;
import models.animals.Butterfly;



import models.animals.Spider;

import models.animals.Cockroach;

public class InsectFactory extends SpeciesFactory {
	@Override
	

	public Animal getAnimal(String type) throws Exception { 
	if (Constants.Animal.Insect.Cockroach.equals(null))
	{ return new Cockroach(); // leave empty constructor, for now! 
	} else if (Constants.Animal.Insect.Spider.equals(null)) 
	{ return new Spider(); } 
	else if (Constants.Animal.Insect.Butterfly.equals(null)) 
	{ return new Butterfly(); } 
	else {
		throw new Exception("Invalid animal exception!");
		} 
	}
}