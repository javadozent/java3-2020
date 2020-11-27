# JPA OneToMany

# application.properties

Beginnen mit create, dann später update (Tabellne werden am Anfang gelöscht)
-> gut zum testen
spring.jpa.hibernate.ddl-auto=create

-> für SpringBoot
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true

-> Logging

logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=DEBUG

## Enteties - Model

### Person
    @OneToMany(mappedBy="person", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Todo> todolist = new ArrayList<>();
    
* get/set
* @OneToMany
* CascadeType.ALL: delete ,save: andere Tabellen werden berücksichtigt

    public void addTodo(Todo t){
        t.setPerson(this); // bidirektional
        this.todolist.add(t);
    }


### Todo

   @ManyToOne(cascade=CascadeType.ALL, optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
    
* optional: Beziehung ist pflicht


## Test
    @SpringBootTest
    class PersonServiceTest {



