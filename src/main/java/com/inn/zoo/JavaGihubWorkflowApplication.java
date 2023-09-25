package com.inn.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGihubWorkflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaGihubWorkflowApplication.class, args);
	}

}

//echo "# git-workflow-ci-cd" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/BikashKumarPradhan/git-workflow-ci-cd.git
//git push -u origin main