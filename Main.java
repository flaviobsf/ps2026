package VideoAula;
import java.util.*;
import  java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        //LIST é uma coleção ordenada que permite elementos duplicados
        List<String> list = new ArrayList<>();
        list.add("Flavio Belsario");
        list.add("Amanda");
        list.add("Flavio Silva");
        list.add("Gael");
        list.add("Flavio Ferreira");

        System.out.println("List " + list);
        System.out.println("List " + list.contains("Flavio"));
        System.out.println("List " + list.size());

        System.out.println("================");


        // SET é uma coleção que não permite elementos duplicados e não mantém uma ordem específica
        Set<String> set = new HashSet<>();
        set.add("Flavio");
        set.add("Amanda");
        set.add("Gael");
        set.add("Flavia");
        set.add("Fernanda");

        System.out.println("ListSet " + set);
        System.out.println("ListSet " + set.contains("Teste"));
        System.out.println("LisSet " + set.size());

        System.out.println("==============");


        // MAP é uma coleção de pares chave-valor, onde cada chave é única
        Map<String, String> map = new HashMap<>();
        map.put("Nome", "Flavio");
        map.put("Sobrenome", "Belisario");
        map.put("Meio", "Silva");
        map.put("Ultimo", "Ferreira");

        System.out.println("Map " + map);
        System.out.println("Map " + map.containsValue("Silva"));
        System.out.println("Map " + map.size());

        System.out.println("==============");


        // QUEUE é uma coleção que segue a ordem FIFO (First In, First Out)
        Queue<String> queue = new LinkedList<>();
        queue.add("Flavio");
        queue.add("Belisario");
        queue.add("Silva");
        queue.add("Ferreira");

        System.out.println("Queue " + queue);
        System.out.println("Queue " + queue.size());
        System.out.println("Queue " + queue.poll());
        System.out.println("Queue " + queue.peek());
        System.out.println("Queue " + queue);
        System.out.println("Queue " + queue.size());
        System.out.println("Queue " + queue.remove());

        System.out.println("==============");

        // LINKEDLIST é uma coleção que permite inserções e remoções eficientes em ambas as extremidades
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Flavio");
        linkedList.addLast("Belisario");
        linkedList.add("Silva");
        linkedList.add("Ferreira");


        System.out.println("LinkedList " + linkedList);
        System.out.println("LinkedList " + linkedList.size());
        System.out.println("LinkedList " + linkedList.pollFirst());
        System.out.println("LinkedList " + linkedList);
        System.out.println("LinkedList " + linkedList.pollLast());
        System.out.println("LinkedList " + linkedList);
        System.out.println("LinkedList " + linkedList.size());

        System.out.println("==============");

        //Stream API
        //Realizar operações funcionais em coleções de dados
        //filter, map, reduce, collect
        //filter: filtrar elementos com base em uma condição
        //map: transformar elementos aplicando uma função
        //reduce: agregar elementos em um único valor
        //agregações - soma média, contagem, máximo, mínimo

        List<String> flavios = list.stream().filter(nome -> nome.startsWith("Flavio")).toList();
        System.out.println("Flavios: " + flavios);

        teste





    }
}
