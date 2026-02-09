package p014arcanoid;

import org.omg.CORBA.TypeCodePackage.BadKind;
import org.omg.CORBA.portable.InputStream;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class MockitoExamen {
	
	public MockitoExamen() {
	}

	public void mockitoEj1(InputStream stream) throws BadKind {
		
		AddressHelper.read(stream);
		if(AddressHelper.type().content_type().default_index()==0) {
			return;
		}else {
			throw new RuntimeException();
		}
		
		
	}

}
