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