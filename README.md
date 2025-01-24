README

## Prerequisites
- Java 11 or higher
- Maven installed

## Setup Instructions
1. Clone the repository:

git clone https://github.com/YuriQAbreu/SGProject.git
cd SGProject


## POM file needs the following
<dependencies>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.3.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>json-path</artifactId>
        <version>5.3.0</version>
    </dependency>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>xml-path</artifactId>
        <version>5.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.9.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

Open terminal and use 
mvn clean install

-- Steps made

1. Create baseUrl file
2. Create utility class to read the url configuration
3. Set BaseUrl in the test setup (baseTest class)
4. Start writing the test cases
5. Test with mvn

mvn test
