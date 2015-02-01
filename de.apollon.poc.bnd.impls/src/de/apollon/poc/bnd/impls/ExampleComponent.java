package de.apollon.poc.bnd.impls;

import aQute.bnd.annotation.component.Component;
import de.apollon.poc.bnd.api.Greeting;

@Component
public class ExampleComponent implements Greeting
{
	public String sayHello(String name)
	{
		return "Hello " + name;
	}
}
