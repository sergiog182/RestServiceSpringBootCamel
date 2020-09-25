package co.poc.bmind.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import co.poc.bmind.jackson.classes.Aplicaciones;

public class SetEmpyAplicationsProcess implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		Aplicaciones aplicaciones = new Aplicaciones();
		ex.getIn().setBody(aplicaciones);
	}

}
