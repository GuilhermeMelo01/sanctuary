package io.github.guilhermemelo01.programming.roadmap.computer_science.hashing;

import java.util.*;

public class Main {
    public static LinkedList<Person>[] dataBase = new LinkedList[10];

    public static class Person {
        Integer id;
        String nome;

        public Person() {
        }

        public Person(Integer id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        public Person(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Person gui = new Person(5, "Guilherme");
        Person carol = new Person(3, "Carol");
        Person dani = new Person(15, "Dani");

        Arrays.stream(dataBase).forEach(System.out::println);

        addPerson(gui);
        addPerson(carol);
        addPerson(dani);

        Arrays.stream(dataBase).forEach(System.out::println);
    }

    public static void addPerson(Person person){
        Integer id = person.getId();
        int position = (id % dataBase.length);
        if(dataBase[position] == null){
            dataBase[position] = new LinkedList<>();
            dataBase[position].addFirst(person);
        }else{
            dataBase[position].addLast(person);
        }
    }


}
