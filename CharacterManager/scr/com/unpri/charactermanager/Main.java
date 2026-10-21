
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Membuat enam karakter dengan role dan level bervariasi
        Character warrior = new Character(
                "Aragorn", CharacterType.WARRIOR, 2
        );

        Character mage = new Character(
                "Merlin", CharacterType.MAGE, 5
        );

        Character archer = new Character(
                "Legolas", CharacterType.ARCHER, 3
        );

        Character healer = new Character(
                "Aurora", CharacterType.HEALER, 6
        );

        Character warrior2 = new Character(
                "Boromir", CharacterType.WARRIOR, 1
        );

        Character mage2 = new Character(
                "Gandalf", CharacterType.MAGE, 8
        );

        // Mengatur mana untuk demo
        mage.setMana(100);
        healer.setMana(150);
        mage2.setMana(200);

        // Output terminal
        System.out.println("=== DAFTAR KARAKTER ===");
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(archer);
        System.out.println(healer);
        System.out.println(warrior2);
        System.out.println(mage2);

        // Demo level up
        System.out.println("\n=== DEMO LEVEL UP ===");
        warrior.levelUp();
        mage.levelUp();

        System.out.println("\n=== SETELAH LEVEL UP ===");
        System.out.println(warrior);
        System.out.println(mage);

        // Mini-Challenge mana
        System.out.println("\n=== MINI-CHALLENGE ===");
        System.out.println(healer);
        System.out.println("Mana Aurora: " + healer.getMana());

        System.out.println(
                "Apakah Aurora masih hidup? " + healer.isAlive()
        );

        try {
            healer.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Validasi berhasil: " + e.getMessage()
            );
        }

        // Menampilkan enam karakter di GUI
        List<Character> characters = Arrays.asList(
                warrior, mage, archer, healer, warrior2, mage2
        );

        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(characters);
            window.setVisible(true);
        });
    }
}
