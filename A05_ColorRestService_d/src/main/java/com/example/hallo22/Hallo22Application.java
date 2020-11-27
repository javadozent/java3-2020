package com.example.hallo22;

import com.example.hallo22.model.Person;
import com.example.hallo22.service.CSVHandler;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class Hallo22Application {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(Hallo22Application.class, args);


    }

}
