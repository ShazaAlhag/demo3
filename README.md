

# Demo3

The excercise consist of design a web-application by using Spring Boot programm:
Frontend-Backend and MySQL database.


* Documentation + UML (UML diagram + Use cases).



# Dependencies in my  program (Web-thymeleaf-JPA(MySQL):

* Spring Boot:

* * Spring MVC

* Spring JPA.

* The codes of the dependencies findout in pom.xml:
* Hereafter I will share my dependencies kodes:
***

        <dependency>
          <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        
        </dependency>



***



***

        <dependency>

            <groupId>org.springframework.boot</groupId>

            <artifactId>spring-boot-starter-thymeleaf</artifactId>

        </dependency>



***



***

        <dependency>

            <groupId>mysql</groupId>

            <artifactId>mysql-connector-java</artifactId>

            <scope>runtime</scope>

        </dependency>



***

***

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>



***





## Requirementslist:

### The program must:

* Signup via MySQL.

* Logg in .

* Show all posts.

* Show all users.




#### Scenario:

* Create user.

* Delete user.

* Add photo (profile photo).

* change photo (profile photo).

* Create post.

* Read post.

* User kan delete his posts.



##### Use Cases:

* Use case 1: Signup.

* Use case 2: Logg in.

* Use case 3: Write post.

* Use case 4: Show all posts.

* Use case 5: Read all posts.

* Use case 6: Update post.



*Observation*:-

* The program has include och extend for control password.


