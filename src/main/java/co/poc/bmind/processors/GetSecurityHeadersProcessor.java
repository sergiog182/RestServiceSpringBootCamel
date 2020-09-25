package co.poc.bmind.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class GetSecurityHeadersProcessor implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		String ipFrom = ex.getIn().getHeader("X-forwarded-for", String.class);
		
	}

}
