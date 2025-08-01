package com.mcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(MCacheApplication.class, args);

		String bannerString = "\n" +
				" __  __   _____ _                _      \n" +
				"|  \\/  | / ____| |              | |     \n" +
				"| \\  / || |    | |__   ___  __ _| |__   \n" +
				"| |\\/| || |    | '_ \\ / _ \\/ _` | '_ \\  \n" +
				"| |  | || |____| | | |  __/ (_| | | | | \n" +
				"|_|  |_| \\_____|_| |_|\\___|\\__,_|_| |_| \n" +
				"           M C a c h e                  \n" +
				"                                        \n";
		System.out.println(bannerString);
	}

}
