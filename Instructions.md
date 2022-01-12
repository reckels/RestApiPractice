# Ex. 11
Create your own Spring Boot ReST API from scratch and commit it to a new GitHub repo in your account.

#### Start
https://start.spring.io/

Add dependencies:
- Spring Web
- MySQL Driver
- Spring Data JPA

Make sure to select Java 17.

#### application.properties
Add to: `src/main/resources/`
```
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://xxx:3306/xxx
spring.datasource.username = xxx
spring.datasource.password = xxx
spring.jpa.hibernate.ddl-auto = xxx
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
spring.jpa.properties.format_sql = true
```

#### GitIgnore
```
# Compiled
*.class
target/**

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.ear

# IntelliJ project files
**/*.iml
.idea/**
.idea
*.iml
out
gen

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*

# DB Stuff
application.properties
```

#### Model
Create a model package UNDER the main package and add a simple test model:
```
@Entity
@Table(name="Cat")
public class Cat {

    @Id
    @GeneratedValue
    private int id;
    private String name;
	
	// Generate constructors.. accessors
}

```

#### Repository
Create a repository package UNDER the main package and add a simple test repository for the test model:
```
@Entity
@Table(name="Cat")
public class Cat {

    @Id
    @GeneratedValue
    private int id;
    private String name;
	
	// Generate constructors.. accessors
}

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {

}
```

#### Create Test Endpoint
Create a controller package UNDER the main package and add a simple test controller:
```
@RestController
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("api/v1/test")
    public String test() {
        catRepository.save(new Cat("test"));
        return "ok";
    }
}
```
- Run the API
- Call it from your browser: `http://localhost:8080/api/v1/test`
- Check the database
- If ok, push to GitHub

#### Create Readme
- `ReadMe.md` (Say something short and sweet)

#### Commit to GitHub
- `git init`
- `git remote add origin <url>`
- `git add --all`
- `git commit -m "first"`
- Make sure the `.gitingore` file is working and that the `application.properties` file is not in the repo!
