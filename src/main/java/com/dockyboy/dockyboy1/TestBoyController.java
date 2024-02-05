package com.dockyboy.dockyboy1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestBoyController {

	@GetMapping("/test")
	public ResponseEntity<?> test(){
		String res= "CIAO";
		return ResponseEntity.ok(res);
	}
	
}
