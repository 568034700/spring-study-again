import com.example.springstudyagain.SpringStudyAgainApplication;
import com.example.springstudyagain.model.ConfigurationBean;
import com.example.springstudyagain.model.ConfigurationPropertiesBean;
import com.example.springstudyagain.repository.ConfigurationAnnotationEntityTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringStudyAgainApplication.class)
public class test {
    @Resource
    ConfigurationBean configurationBean;

    @Autowired
    ConfigurationPropertiesBean configurationPropertiesBean;

    @Test
    public void ConfigurationAnnotationTest() {
        ConfigurationAnnotationEntityTest configurationAnnotationEntityTest = configurationBean.configurationAnnotationTest();
        configurationAnnotationEntityTest.go();
    }

    @Test
    public void ConfigurationPropertiesAnnotationTest() {
        System.out.println(configurationPropertiesBean);
    }

}
