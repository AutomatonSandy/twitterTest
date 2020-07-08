package factoryPackage;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import testngfeatures.ClassOne;
import testngfeatures.ClassThree;
import testngfeatures.ClassTwo;

public class FactoryClass1 {
	
    @Test
	@Factory
	public Object[] factoryMethod1() {
		return new Object[] {new ClassOne(1, 2), new ClassTwo(), new ClassThree()};
		
	}

}
