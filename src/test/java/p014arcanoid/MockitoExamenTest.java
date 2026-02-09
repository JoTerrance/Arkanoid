package p014arcanoid;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.TypeCodePackage.BadKind;
import org.omg.CORBA.portable.InputStream;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

class MockitoExamenTest {
	@Test
	void testA() throws BadKind {
		MockitoExamen examen = new MockitoExamen();
		InputStream stream = mock(InputStream.class);
		TypeCode typeCode = mock(TypeCode.class);
		TypeCode typeCode2 = mock(TypeCode.class);
		mockStatic(AddressHelper.class);
		when(AddressHelper.type()).thenReturn(typeCode);
		when(typeCode.content_type()).thenReturn(typeCode2);
		when(typeCode.default_index()).thenReturn(0);

		examen.mockitoEj1(stream);
	}


}
