# JPA/Hibernate

## Dependencies

    
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        
## Konfiguration

* application.properties


## Links
* https://www.h2database.com/html/main.html
* https://www.baeldung.com/spring-boot-h2-database
* https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html


## H2 Console
* http://localhost:8080/h2-console
### Parameter - siehe application.properties
* Generic H2 (Embedded)
* Generic H2 (Embedded)
* org.h2.Driver
* jdbc:h2:mem:testdb
* sa
* password


# Feature
* findAll
* save Todo
* set/update done
* Logging
* Theme
# TODO 
* delete Todo
* DB austauschen  MySQL



# Teil 2 
* Datensatz löschen -Primefaces ContextMenu oder anders/Meldung?
* Suche nach Einträgen/Filter -DB-DAOMethode oder Primfaces
* fertige Enträge ausblenden filter?
* Primfaces: sort, paginator??