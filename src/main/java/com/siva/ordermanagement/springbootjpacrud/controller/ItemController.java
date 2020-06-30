package com.siva.ordermanagement.springbootjpacrud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siva.ordermanagement.springbootjpacrud.exception.ResourceNotFoundException;
import com.siva.ordermanagement.springbootjpacrud.model.ItemInfo;
import com.siva.ordermanagement.springbootjpacrud.model.OrderInfo;
import com.siva.ordermanagement.springbootjpacrud.repo.ItemInfoRepository;

@RestController
public class ItemController {

	
	@Autowired
	ItemInfoRepository itemInfoRepository;
	@GetMapping("/all/items")
	public List<ItemInfo> getAllEmployees() {
		return itemInfoRepository.findAll();
	}

	@GetMapping("/item/{id}")
	public ResponseEntity<ItemInfo> getItemById(@PathVariable(value = "id") Long itemNo)

			throws ResourceNotFoundException {
		ItemInfo itemInfo = itemInfoRepository.findById(itemNo)
				.orElseThrow(() -> new ResourceNotFoundException("Item not found for this id :: " + itemNo));
		return ResponseEntity.ok().body(itemInfo);
	}

	@PostMapping("/Item")
	public ItemInfo createEmployee(@Valid @RequestBody ItemInfo item) {
		return itemInfoRepository.save(item);
	}

}
