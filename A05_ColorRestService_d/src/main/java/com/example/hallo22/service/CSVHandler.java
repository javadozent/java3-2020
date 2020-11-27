package com.example.hallo22.service;

import com.example.hallo22.model.Person;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVHandler {




    public  void test() throws IOException {
        try {
            ResourceLoader resourceLoader = new DefaultResourceLoader();
            Resource resource = resourceLoader.getResource("classpath:csv/sample-input.csv");

            List<Person> lst= new CsvToBeanBuilder(new FileReader(resource.getFile()))
                    .withType(Person.class).build().parse();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            new CSVHandler().test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
