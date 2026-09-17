package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int sorteado, chute = 0, max = 10, maxTentativas = 3, tentativas = 0;
        double randomNumber = Math.random() * (max + 1);
        sorteado = (int) randomNumber;

        do {
            String entrada = JOptionPane.showInputDialog(
                    "Digite um número entre 0 e " + max + ":"
            );

            chute = Integer.parseInt(entrada);
            tentativas++;

            if (chute == sorteado) {
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            } else {
                if (tentativas >= maxTentativas) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Atingiu o número máximo de tentativas!\nNúmero sorteado: " + sorteado
                    );
                } else if (chute > sorteado) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Dica: o número sorteado é menor"
                    );
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Dica: o número sorteado é maior"
                    );
                }
            }

        } while (chute != sorteado && tentativas < maxTentativas);
    }
}