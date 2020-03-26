package restoms.controllers;


import com.demogrpc.APIResponse;
import com.demogrpc.APIResponseOrBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restoms.dao.OmsOrder;
import restoms.model.NewOrder;
import restoms.server.GrpcClient;
import restoms.service.OrderService;

import javax.validation.Valid;


@RestController
@RequestMapping("orders") // http://localhost:8080/orders
public class OrderController {
	@Autowired
	private OrderService service;
	@Autowired
	private GrpcClient grpcClient;
	
	@GetMapping(path = "{orderId}",produces = {
			org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<APIResponse> getOrder(@PathVariable String orderId) {
		APIResponse apiResponse= grpcClient.getOrder(orderId);

        //OmsOrder o= service.getOrder(orderId);
		System.out.println(apiResponse);
		return new ResponseEntity<APIResponse>(apiResponse,HttpStatus.OK);

		
	}
	
	
	 
	  
	  @PostMapping(consumes =
	  {org.springframework.http.MediaType.APPLICATION_JSON_VALUE}, produces =
	  {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> createOrder(@Valid @RequestBody NewOrder norder) {
		  
		String orderId= service.createOrder(norder);
		return new ResponseEntity<String>("Order Successfully Placed with orderId = " +orderId, HttpStatus.OK);
	}

}
