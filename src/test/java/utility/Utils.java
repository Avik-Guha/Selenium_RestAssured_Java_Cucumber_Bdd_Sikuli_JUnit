package utility;

import java.io.PrintStream;

import base.Base;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public static RequestSpecification requestSpecBuilder;

	public static RequestSpecification requestSpecification() throws Exception {

		if (requestSpecBuilder == null) {
			
			PrintStream log = Base.logSetup();
			
			// Build Request Builder
			requestSpecBuilder = new RequestSpecBuilder().setBaseUri(Base.getEnv()).addQueryParam("key", "qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(ContentType.JSON).build();
			return requestSpecBuilder;
		}
		return requestSpecBuilder;
	}

}
