package hooks;

import base.Base;
import io.cucumber.java.Before;
//import stepDefinations.PlaceValidation;


public class Hooks {
	
	@Before
    public void setUp() throws Exception {
		Base.setEnv();
    }
	

}
