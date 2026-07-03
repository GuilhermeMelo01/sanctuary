package io.github.guilhermemelo01.programming.roadmap.computer_science.hashing.base;

import java.util.NoSuchElementException;

public class HashTable {
    private static HashNode<Integer, String>[] buckets = new HashNode[10]; // 10 is my capacity

    public static void main(String[] args) {
        add(new HashNode<>(10, "João"));
        add(new HashNode<>(110, "Gui"));
        add(new HashNode<>(11, "Ana"));
        add(new HashNode<>(1110, "Ana"));
        add(new HashNode<>(1110, "Vitoria"));

        remove(11);

        System.out.println(get(1110));

        for (HashNode bucket : buckets) {
            System.out.println(bucket);
        }
    }

    public static String get(Integer chave){
        if (chave == null){
            throw new NullPointerException("Chave está nula");
        }
        Integer index = hashFunction(chave);
        HashNode<Integer, String> bucket = buckets[index];
        while(bucket != null){
            if(bucket.getChave().equals(chave)){
                return bucket.getValor();
            }
            bucket = bucket.next;
        }

        throw new NoSuchElementException("Elemento com a chave: "+ chave + " não foi encontrado");
    }

    public static void add(HashNode node) {
        Integer index = hashFunction((Integer) node.getChave());

        HashNode<Integer, String> bucket = buckets[index];
        while (bucket != null){
            if(bucket.getChave().equals(node.getChave())){
                bucket.setValor((String) node.getValor());
                return;
            }
            bucket = bucket.next;
        }

        if (buckets[index] == null) {
            buckets[index] = node;
        } else {
            node.next = buckets[index];
            buckets[index] = node;
        }
    }

    public static HashNode remove(Integer chave){
        Integer index = hashFunction(chave);
        HashNode<Integer, String> bucket = buckets[index];

        HashNode previous = bucket;
        HashNode atual = bucket.next;

        if (previous.getChave().equals(chave)){
            buckets[index] = atual;
            return previous;
        }

        while(atual != null){
            if(atual.getChave().equals(chave)){
                previous.next = atual.next;
                return atual;
            }
            previous = atual;
            atual = atual.next;
        }

        throw new IllegalArgumentException("Node não foi encontrado");
    }

    private static Integer hashFunction(Integer chave) {
        return (chave % buckets.length);
    }

    private static class HashNode<C, V> {
        C chave;
        V valor;
        HashNode<C, V> next;

        public HashNode() {
        }

        public HashNode(C chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }

        public C getChave() {
            return chave;
        }

        public void setChave(C chave) {
            this.chave = chave;
        }

        public V getValor() {
            return valor;
        }

        public void setValor(V valor) {
            this.valor = valor;
        }

        public HashNode<C, V> getNext() {
            return next;
        }

        public void setNext(HashNode<C, V> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "HashNode[" +
                    "chave=" + chave +
                    ", valor=" + valor +
                    ", next=" + next +
                    ']';
        }
    }

}
