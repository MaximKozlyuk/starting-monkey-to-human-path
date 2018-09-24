package PO61.Kozlyuk.wdad.learn.xml;

import java.util.ArrayList;

public class Reader extends Human{

    private ArrayList<Book> debtBooks;

    Reader(String firstName, String secondName) {
        super(firstName, secondName);
    }

    void addTookedBook (Book book) {
        if (book == null ) { throw new NullPointerException(); }
        debtBooks.add(book);
    }

    boolean returnBook (Book book) {
        if (book == null ) { throw new NullPointerException(); }
        if (debtBooks.contains(book)) {
            debtBooks.remove(book);
            return true;
        } else {
            return false;
        }
    }

    ArrayList<Book> getDebtBooks() {
        return debtBooks;
    }

    @Override
    String getFirstName() {
        return super.getFirstName();
    }

    @Override
    String getSecondName() {
        return super.getSecondName();
    }

    @Override
    void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        if (debtBooks.isEmpty()) {
            s.append(", no debts");
        } else {
            s.append("\nbook(s) debt: ").append(debtBooks.size()).append("\n");
            for (int i = 0; i < debtBooks.size(); i++) {
                s.append(debtBooks.toString()).append("\n");
            }
        }
        return s.toString();
    }
}