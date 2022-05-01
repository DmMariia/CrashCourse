package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.*;

import static org.junit.jupiter.api.Assertions.*;




    @Test
    void testGetBirthYear() {
        Person person = new Person("Petro", 1995);
        assertEquals(1995, person.getBirthYear());
    }

    @Test
    void testGetAge() {
        Person person = new Person("Petro", 1995);
        assertEquals(27, person.getAge());
    }

    @Test
    void testInputName() {

    }

    @Test
    void testInputBirthYear() {

    }

    @Test

    void testOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream old = System.out;
        Person person = new Person();
        System.setOut(new PrintStream(output));
        person.output();
        Assertions.assertEquals();
    }



    @Test
    void TestChangeName() throws IOException {
       ByteArrayOutputStream buffer = new ByteArrayOutputStream();
       Person person = ;
    }
}

public class PersonTest {
    @Test
    void testGetName() {
        Person person = new Person("Petro", 1995);
        assertEquals("Petro", person.getName());
    }
}