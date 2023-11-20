package tech.buildrun.debug;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;

@SpringBootApplication
public class DebugApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DebugApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Resource resource = new ClassPathResource("files.json");

		InputStream input = resource.getInputStream();

		File file = resource.getFile();

		System.out.println(Files.readString(file.toPath()));
	}
}
