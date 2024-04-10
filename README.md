# Gradebook Project Setup
This document provides a step-by-step guide on how to set up the parent project for the Gradebook microservices.

## Project Creation

1. Launch IntelliJ IDEA and select New Project.
2. Provide a suitable name for your project.
3. Choose the directory where you want to save the project.
4. Specify a unique Group ID for your project.

Note: After adding your modules, please ensure to delete the default source folder.

## Project Configuration 
### Adding .gitignore
Create a `.gitignore` file in the project root directory. This file should contain rules for ignoring files and directories that should not be tracked by Git.

### Adding pom.xml
In your `pom.xml` file, make the following additions:

After the `<modelVersion>` tag, add the parent project information:
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.2.3</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
```

In the `<properties>` section, add the build configuration:
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <configuration>
                <excludes>
                    <exclude>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                    </exclude>
                </excludes>
            </configuration>
        </plugin>
    </plugins>
</build>

This configuration excludes the Lombok library from the build process, as it is only needed during development and not in the final packaged application.
```

# Adding a New Module 

Follow these steps to add a new module to your project:

1. Right-click on the project root directory and select `New -> Module`.
2. Provide a suitable name for the module.
3. Choose the directory where you want to save the module. This should be under the parent directory.
4. Specify a unique Group ID for your module. Ensure that it matches the Group ID of the parent project.
5. Click `Finish`.
6. Repeat these steps for each module you want to add to the project.
7. After adding your modules, ensure to delete the default source folder in the parent directory.
8. Create an `application.properties` file in the `resources` directory located under `src/main/resources`.
9. Update the `application.properties` file in each module with the necessary configuration details. These may include:
    1. Database connection settings: Specify the URL, username, and password for your database connection.
    2. Server port: Define the port on which your application will run.
    3. Other module-specific properties: Include any additional properties that are specific to each module.

To add dependencies in the `pom.xml` files, you can visit the [Spring Initializr](https://start.spring.io/) website:
- Choose the correct project type, language, and Spring Boot version, and add the dependencies you may need.
- Then click on `Explore` and you can copy and paste the needed dependencies into the modules.