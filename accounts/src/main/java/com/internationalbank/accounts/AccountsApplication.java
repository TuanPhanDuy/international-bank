package com.internationalbank.accounts;

import com.internationalbank.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "International bank accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Tuan Bin",
						email = "tuanbin007@gmail.com",
						url = "https://www.facebook.com/tnb.anbite"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.facebook.com/tnb.anbite"
				)
		),
		externalDocs = @ExternalDocumentation(
			description = "International bank accounts microservice REST API Documentation",
			url = "https://www.facebook.com/tnb.anbite"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
