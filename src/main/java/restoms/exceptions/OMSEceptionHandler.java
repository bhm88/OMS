package restoms.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import restoms.model.ErrorMessage;

import java.util.Date;


@ControllerAdvice
public class OMSEceptionHandler  extends ResponseEntityExceptionHandler{

	
	
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<Object> handleEception(Exception ex,WebRequest request){
		
		String errmsgdesc=ex.getLocalizedMessage();
		if(errmsgdesc==null) errmsgdesc=ex.toString();
		
		ErrorMessage errorMessage= new ErrorMessage(new Date(),errmsgdesc);
		return new ResponseEntity<>(
				errorMessage,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value= {NullPointerException.class,OrderException.class})
	public ResponseEntity<Object> handleSpecificEception(Exception ex,WebRequest request){
		
		String errmsgdesc=ex.getLocalizedMessage();
		if(errmsgdesc==null) errmsgdesc=ex.toString();
		
		ErrorMessage errorMessage= new ErrorMessage(new Date(),errmsgdesc);
		return new ResponseEntity<>(
				errorMessage,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
