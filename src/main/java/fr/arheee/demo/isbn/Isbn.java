package fr.arheee.demo.isbn;

import java.util.Objects;

public class Isbn {
    public boolean checkIsbn(String isbn) {

        int somme = 0;

        for (int index = 0; index < isbn.length(); index++) {
            if (isbn.charAt(index) == 'X') {
                somme += 10 * (index + 1);
            } else {
                somme += Integer.parseInt(String.valueOf(isbn.charAt(index))) * (index + 1);
            }
        }

        return somme % 11 == 0;
    }
}
