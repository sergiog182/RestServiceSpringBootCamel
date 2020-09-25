package co.poc.bmind.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.poc.bmind.jackson.classes.Error;

public class SetErrorResponseProcess implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		Error error = new Error();
		
		String errorCode = ex.getIn().getHeader("errorCode", String.class);
		String errorMessage = ex.getIn().getHeader("errorMessage", String.class);
		
		error.setMensaje(errorMessage);
		error.setCodigo(errorCode);
		
		ex.getIn().setBody(error);
	}

}
