# JavaFX and Spring Boot

## Feature
* JavaFX
* H2DB
* JPA



## Tutorial

* https://www.vojtechruzicka.com/javafx-spring-boot/


For the integration to work properly, it is necessary to create it in the resources folder,
but in a directory structure matching the package where is our controller.

For example, let's assume our controller is in package com.vojtechruzicka.javafxweaverexample.
The .fxml file needs to be placed precisely here:

    src\main\resources\com\vojtechruzicka\javafxweaverexample
    

## Controller

* no @FXML Annotation!!!  