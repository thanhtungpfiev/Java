package treeset_test;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

/**
 * @author Admin
 * @date 3/12/2022
 */
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    private void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }

}

class Book implements Comparable<Book> {
    String title;
    public Book(String t) {
        title = t;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return title;
    }
}
