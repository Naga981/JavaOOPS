package exampleStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class C1 {
    public static void main(String args[]) {
        capitalize();
        reverseString();
        convertIntString();
        countWordsChars();
        treeSet1();
    }
    
    static void capitalize() {
        String a = "welcome to java";
        char b;
        String c="";
        String temp;
        int count =0;
        
        for(int i=0; i<a.length(); i++) {
            b=a.charAt(i);
            
            count = count+1;
            if(b==' ') {
                count = 0;
            }
            if(count==1) {
                temp = String.valueOf(b).toUpperCase();
                c=c+temp;
            }else
            c=c+b;
        }
        System.out.println(c);
    }
    
    static void reverseString() {
        String a = "welcome to java world";
        String b[] = a.split(" ");
        String c="";       
        
        for(int i=0; i<b.length; i++) {
            c=b[i]+" "+c;
        }
        System.out.println(c);
    }

    static void countWordsChars() {
        String a = "welcome to java. Learn java.";
        //ArrayList<Integer> b = new ArrayList<Integer>();
        //TreeSet<Integer> c = new TreeSet<Integer>();
        TreeMap<String, Integer> d = new TreeMap<String, Integer>();
        a=a.toUpperCase();
        String e[] = a.split(" ");
        char[] f = a.toCharArray();
        int value;
        String key;
        
        for(int i=0; i<e.length; i++) {
            key = e[i].replace(".", "");
            if(d.containsKey(key)) {
                value = d.get(key);
                d.put(key, value+1);
            }else
            d.put(key, 1);
        }
        System.out.println(d);
        
        String a1=a.replace(".", "").replace(" ", "").toLowerCase();
        //System.out.println(a1);
        char c1[] = a1.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        char key1;
        int value1;
        
        for(int i=0; i<c1.length; i++) {
            key1 = c1[i];            
            if(map.containsKey(key1))
                {value1 = map.get(key1);
                map.put(key1, value1+1);
                }else
            map.put(key1,1);            
        }
        System.out.println(map);        
    }
    
    
    
    
    static void treeSet1() {

        TreeMap<Integer, String> c = new TreeMap<Integer, String>();
        c.put(2, "Two");
        c.put(4, "Four");
        
        System.out.println(c.get(2));
        

        TreeSet<Integer> a = new TreeSet<Integer>();
        a.add(22);
        a.add(44);
        a.add(22);

        Iterator<Integer> b = a.iterator();
        while(b.hasNext())
            System.out.println(b.next());
        
    }
    
    static void ascii() {
       char a = 'a';
       char b = 'z';
       int c = Integer.valueOf(a);
       int d = Integer.valueOf(b);
       
       System.out.println(c);
       System.out.println(d);
       if(a<b)System.out.println(a);
    }
    
    public static void array1() {
        int a[] = new int[5];
        a[0]=22;
        a[1]=44;
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(66);
        b.add(34);        
        Collections.sort(b);
        ArrayList<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }        
        for(int j=0; j<b.size(); j++) {
            System.out.println(b.get(j));
        }
        for(int j=0; j<c.size(); j++) {
            System.out.println(c.get(j));
        }
     }
    
    
    public static void convertIntString() {
        int a = 123;
        String b = String.valueOf(a);
        int c = Integer.valueOf(b);
        System.out.println(c+2);
        System.out.println(b+2);
    }
    
    
    public static void m1() {
        Scanner b = new Scanner(System.in);
        System.out.println("enter string");
        String c = b.next();
        System.out.println(c);
    }
}
