package pe.com.demo.java.prjlambda.interfaces;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class ExampleFunction2 {

    static Function<Person, ByteArrayOutputStream> serializer = p -> {
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(inMemoryBytes)) {
            objectOutputStream.writeObject(p);
            objectOutputStream.flush();
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Person> deserializer = p -> {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(p)) {
            return (Person) objectInputStream.readObject();

        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    };

    public static void main(String[] args) {
        ByteArrayOutputStream objectOutputStream = serializer.apply(new Person("John", 22));

        System.out.println(Arrays.toString(objectOutputStream.toByteArray()));

        Person person = deserializer.apply(new ByteArrayInputStream(objectOutputStream.toByteArray()));
        System.out.println(person);
    }

}

@ToString
class Person implements Serializable {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
