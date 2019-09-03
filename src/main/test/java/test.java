import com.example.springstudyagain.SpringStudyAgainApplication;
import com.example.springstudyagain.model.ConfigurationBean;
import com.example.springstudyagain.repository.ConfigurationAnnotationEntityTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringStudyAgainApplication.class)
public class test {
    @Resource
    ConfigurationBean configurationBean;

    @Test
    public void ConfigurationAnnotationTest() {
        ConfigurationAnnotationEntityTest configurationAnnotationEntityTest = configurationBean.configurationAnnotationTest();
        configurationAnnotationEntityTest.go();
    }

}
