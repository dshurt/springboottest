/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.sdl.openstorefront.spring.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dshurtleff
 */
@RestController
public class ServiceModuleController
{

	@RequestMapping("/test")
	public String index()
	{
		return "Hello from Service 2";
	}

}
