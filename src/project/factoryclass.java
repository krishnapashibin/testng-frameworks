package project;

import org.testng.annotations.Factory;

public class factoryclass {
	
	@Factory
	public Object[] factory(){
		return new Object[] {new factoryexample("Krishna","Krishna@123"),
				new factoryexample("Seethal","Sethal@123")};
	}

}
