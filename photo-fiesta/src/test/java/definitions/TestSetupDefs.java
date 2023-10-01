package definitions;

import com.example.photofiesta.PhotoFiestaApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = PhotoFiestaApplication.class)
public class TestSetupDefs {
    public static final String BASE_URL = "http://localhost:";

    @LocalServerPort
    public String port;
}
