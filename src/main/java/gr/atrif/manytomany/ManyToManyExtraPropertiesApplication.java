package gr.atrif.manytomany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ManyToManyExtraPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyExtraPropertiesApplication.class, args);
    }

}
@Component
class DataInitializer implements CommandLineRunner {

    private TagRepository tagRepository;

    DataInitializer(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Tag tag = new Tag("first tag");
        this.tagRepository.save(tag);
    }
}
