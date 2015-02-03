package de.apollon.poc.bnd.itest;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import de.apollon.poc.bnd.api.Greeting;
import junit.framework.TestCase;

public class ExampleTest extends TestCase
{

	private final BundleContext context = FrameworkUtil.getBundle(this.getClass()).getBundleContext();

	public void testExample() throws Exception
	{
		ServiceReference serviceReference = context.getServiceReference(Greeting.class.getName());
		Greeting service = (Greeting) context.getService(serviceReference);

		service.sayHello("teeeeest");

	}
}
