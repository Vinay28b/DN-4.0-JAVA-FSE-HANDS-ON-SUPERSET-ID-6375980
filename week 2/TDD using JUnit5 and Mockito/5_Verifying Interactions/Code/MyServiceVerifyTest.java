package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MyServiceVerifyTest {

    @Test
    public void testFetchData_VerifyInteraction() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mocked Response");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        assertEquals("Mocked Response", result);
        verify(mockApi).getData();
    }
}
