package com.peixeurbano.SimpleDealApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peixeurbano.SimpleDealApp.models.BuyOption;
import com.peixeurbano.SimpleDealApp.services.BuyOptionService;

@RestController
@RequestMapping("buy-option")
public class BuyOptionController {

	@Autowired
	private BuyOptionService buyOptionService;

	@PostMapping
	public BuyOption save(@RequestBody BuyOption buyOption) {
		return buyOptionService.save( buyOption );
	}

	@GetMapping("{id}")
	public BuyOption find(@RequestParam("id") Long id) {
		return buyOptionService.findById( id );
	}

}
