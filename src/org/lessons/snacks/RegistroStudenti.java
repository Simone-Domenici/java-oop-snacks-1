package org.lessons.snacks;

import java.lang.reflect.Array;

public class RegistroStudenti {
    private Studente[] studenti;
    private int count;
    private static final int MAX_STUDENTI = 100;

    public RegistroStudenti() {
        studenti = new Studente[MAX_STUDENTI];
        count = 0;
    }

    public void addStudente(Studente studente) {
        if ( count < MAX_STUDENTI) {
            studenti[count] = studente;
            count++;
        } else {
            System.out.println("Registro pieno");
        }
    }

    public void getStudenti() {
        if ( count == 0) {
            System.out.println("Registro Vuoto");
            return;
        }
        System.out.println("Lista Studenti:");
        for (int i = 0; i < count; i++) {
            System.out.println(studenti[i]);
        }
    }
}
