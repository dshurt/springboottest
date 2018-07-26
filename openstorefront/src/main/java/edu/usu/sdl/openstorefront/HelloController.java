package edu.usu.sdl.openstorefront;

import java.util.concurrent.Callable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dshurtleff
 */
@RestController
public class HelloController
{

	@RequestMapping("/")
	public String index()
	{
		return "Greetings from Spring Change 31!";
	}

	@GetMapping("/async")
	public Callable<String> helloWorldAsync()
	{
		return () -> "async: Hello World2";
	}

}
