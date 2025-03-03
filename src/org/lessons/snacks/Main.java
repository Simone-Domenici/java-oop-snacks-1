package org.lessons.snacks;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Snack 1: Studente
        Studente Bitta = new Studente("Anselmo", "Bitta", 24);
        System.out.println(Bitta.fullInfo());

        //Snack 2: Gestione di un Conto
        ContoBancario mioConto = new ContoBancario(27364958);
        System.out.println(mioConto.getBalance());
        mioConto.addBalance(new BigDecimal(25500.80));
        System.out.println(mioConto.getBalance());
        mioConto.withdrawBalance(new BigDecimal(2000));
        System.out.println(mioConto.getBalance());

        //Snack 3: Registro Studenti
        RegistroStudenti registro = new RegistroStudenti();
        registro.getStudenti();
        registro.addStudente(new Studente("Mario", "Rossi", 21));
        registro.addStudente(new Studente("Luigi", "Bianchi", 20));
        registro.addStudente(new Studente("Alice", "Vitulli", 24));
        registro.getStudenti();
    }
}
