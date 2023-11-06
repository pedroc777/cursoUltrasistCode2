package net.ultrasist.capacitacion.chambeaya.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/")
public class HelloController {

	@ApiOperation(value = "HelloController::helloWorld", notes = "Saluda")
	@GetMapping(value = "hello/", produces = "application/json; charset=utf-8")
	public String helloWorld() {
		return "Hola";
	}
}
