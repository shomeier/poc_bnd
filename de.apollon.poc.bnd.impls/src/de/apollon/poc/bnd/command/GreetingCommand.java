/**
 *
 */
package de.apollon.poc.bnd.command;

import org.apache.felix.service.command.CommandProcessor;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;
import de.apollon.poc.bnd.api.Greeting;

@Component(properties = { CommandProcessor.COMMAND_SCOPE + ":String=example", CommandProcessor.COMMAND_FUNCTION + ":String=greet" }, provide = Object.class)
public class GreetingCommand
{
	private Greeting greetingSvc;

	@Reference
	public void setGreeting(Greeting greetingSvc)
	{
		this.greetingSvc = greetingSvc;
	}

	public void greet(String name)
	{
		System.out.println(greetingSvc.sayHello(name));
	}
}
