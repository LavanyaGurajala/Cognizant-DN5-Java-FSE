import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData("Test Data");

        verify(mockApi).sendData("Test Data");
    }
}
