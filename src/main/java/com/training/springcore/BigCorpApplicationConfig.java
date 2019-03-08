import com.training.springcore.service.CaptorServiceImpl;
        import com.training.springcore.service.SiteServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
public class BigCorpApplicationConfig {
    @Bean
    public SiteServiceImpl siteService() {
        return new SiteServiceImpl(captorService());
    }
    @Bean
    public CaptorServiceImpl captorService() {
        return new CaptorServiceImpl();
    }
}