/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;



/**
 *
 * @author wilver
 */
public class Ejercicio02Collection {
    public static void main(String[] args) {
        /*
            The Collection Interface
            This enables you to work with groups of objects; it is at the top of the collections hierarchy.
            http://www.javatpoint.com/collections-in-java
        */
        //Tipos de collección
        Collection<String> list=new ArrayList<String>();        
        list.add("guia 1");
        list.add("guia 2");
        list.add("guia 3");
        list.add("guia 3");
        list.add("guia 4");
        System.out.println("Lista de datos");
        System.out.print(list);
        System.out.println("");
        list.remove("guia 2");
        System.out.println("Lista de datos despues de remover \"guia2\"");
        System.out.print(list);
        System.out.println("");
        String lookingfor="guia 3";
        //String lookingfor=JOptionPane.showInputDialog(null, "Ingrese el texto a buscar",JOptionPane.QUESTION_MESSAGE);
        
        System.out.println("Buscando un dato \" "+lookingfor +"\"");
        Boolean result=list.contains(lookingfor);
        System.out.println("El texto \" "+lookingfor +"\"" +(result==false?" NO ":"")+ " fue encontrada en la lista" );
        
        System.out.println("");
        System.out.println("QUEUE");
        PriorityQueue<String> queue=new PriorityQueue<String>();
        /*
            boolean add(object)	It is used to insert the specified element into this queue and return true upon success.
            boolean offer(object)	It is used to insert the specified element into this queue.
            Object remove()	It is used to retrieves and removes the head of this queue.
            Object poll()	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
            Object element()	It is used to retrieves, but does not remove, the head of this queue.
            Object peek()	It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        */
        queue.add("guia 1");
        queue.add("guia 2");
        queue.add("guia 3");
        queue.add("guia 3");
        queue.add("guia 4");
        System.out.print(queue);
        System.out.println("");
        queue.remove("guia 3");
        System.out.println("El primer elemento que este tipo de objeto es: "+queue.peek()+ "; Notamos que es el primero ingresado(FIFO)." );
        
        LinkedList<String> linkedList=new LinkedList<String>();
        /*
            void add(int index, Object element)	It is used to insert the specified element at the specified position index in a list.
            void addFirst(Object o)	It is used to insert the given element at the beginning of a list.
            void addLast(Object o)	It is used to append the given element to the end of a list.
            int size()	It is used to return the number of elements in a list
            boolean add(Object o)	It is used to append the specified element to the end of a list.
            boolean contains(Object o)	It is used to return true if the list contains a specified element.
            boolean remove(Object o)	It is used to remove the first occurence of the specified element in a list.
            Object getFirst()	It is used to return the first element in a list.
            Object getLast()	It is used to return the last element in a list.
            int indexOf(Object o)	It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list does not contain any element.
            int lastIndexOf(Object o)	It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list does not contain any element.
        */
        
        linkedList.add("guia 1");
        linkedList.add("guia 2");
        linkedList.add("guia 3");
        linkedList.add("guia 3");
        linkedList.add("guia 4");
        linkedList.addLast("guia 0");
        System.out.println("");
        System.out.println("Listas enlazadas");
        System.out.print(linkedList);
        System.out.println("");
        System.out.println("Primer elemento "+ linkedList.getFirst());
        System.out.println("Ultimo elemento "+ linkedList.getLast());
        System.out.println("Elemento en la posición 1 "+ linkedList.get(1));
        
        for(String dato:linkedList)
            System.out.println(dato);
        
        Collection<String> hashSet=new HashSet<String>();
        /*
        void clear()	It is used to remove all of the elements from this set.
        boolean contains(Object o)	It is used to return true if this set contains the specified element.
        boolean add(Object o)	It is used to adds the specified element to this set if it is not already present.
        boolean isEmpty()	It is used to return true if this set contains no elements.
        boolean remove(Object o)	It is used to remove the specified element from this set if it is present.
        Object clone()	It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
        Iterator iterator()	It is used to return an iterator over the elements in this set.
        int size()	It is used to return the number of elements in this set
        */
        System.out.println("");
        System.out.println("HASHSET");
        hashSet.add("guia 1");
        hashSet.add("guia 2");
        hashSet.add("guia 3");
        hashSet.add("guia 3");
        hashSet.add("guia 4");
        for(String data:hashSet)
            System.out.println(data);
    }
}
