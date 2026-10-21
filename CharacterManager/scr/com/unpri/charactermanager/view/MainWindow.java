
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

    private final JPanel characterPanel;

    public MainWindow(List<Character> characters) {

        setTitle("Character Manager v0.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel utama
        JPanel root = new JPanel(
                new BorderLayout(16, 16)
        );

        root.setBackground(AppTheme.BACKGROUND);
        root.setBorder(AppTheme.WINDOW_BORDER);
        root.setOpaque(true);

        // Judul
        JLabel title = new JLabel("CHARACTER MANAGER");
        title.setFont(AppTheme.TITLE_FONT);
        title.setForeground(AppTheme.TEXT);

        JLabel subtitle = new JLabel(
                "Daftar karakter dan informasi role"
        );
        subtitle.setFont(AppTheme.SMALL_FONT);
        subtitle.setForeground(AppTheme.SECONDARY_TEXT);

        JPanel header = new JPanel(
                new GridLayout(0, 1, 4, 4)
        );

        header.setBackground(AppTheme.SURFACE);
        header.setBorder(AppTheme.SECTION_BORDER);
        header.setOpaque(true);

        header.add(title);
        header.add(subtitle);

        // Panel kartu karakter
        characterPanel = new JPanel(
                new GridLayout(0, 2, 12, 12)
        );

        characterPanel.setBackground(AppTheme.BACKGROUND);
        characterPanel.setOpaque(true);

        if (characters != null) {
            for (Character character : characters) {
                if (character != null) {
                    characterPanel.add(
                            createCharacterCard(character)
                    );
                }
            }
        }

        // Scroll jika jumlah kartu banyak
        JScrollPane scrollPane =
                new JScrollPane(characterPanel);

        scrollPane.getViewport()
                .setBackground(AppTheme.BACKGROUND);

        scrollPane.setBorder(null);

        // Susun layout
        root.add(header, BorderLayout.NORTH);
        root.add(scrollPane, BorderLayout.CENTER);

        setContentPane(root);

        // Ukuran jendela mengikuti isi
        pack();
        setLocationRelativeTo(null);
    }

    private JPanel createCharacterCard(Character character) {

        CharacterType type = character.getType();

        JPanel card = new JPanel(
                new GridLayout(0, 1, 5, 5)
        );

        // Tema kartu
        card.setBackground(AppTheme.colorFor(type));
        card.setBorder(AppTheme.borderFor(type));
        card.setOpaque(true);

        // Nama
        JLabel nameLabel =
                new JLabel(character.getName());

        nameLabel.setFont(AppTheme.HEADING_FONT);
        nameLabel.setForeground(AppTheme.TEXT);

        // Role
        JLabel typeLabel =
                new JLabel("Role: " + type);

        typeLabel.setFont(AppTheme.BODY_FONT);
        typeLabel.setForeground(AppTheme.TEXT);

        // Level
        JLabel levelLabel =
                new JLabel("Level: " + character.getLevel());

        levelLabel.setFont(AppTheme.BODY_FONT);
        levelLabel.setForeground(AppTheme.TEXT);

        // Mini-Challenge:
        // level minimal 5 menggunakan teks emas dan tebal
        if (character.getLevel()
                >= AppTheme.HIGH_LEVEL_THRESHOLD) {

            levelLabel.setFont(AppTheme.HIGH_LEVEL_FONT);
            levelLabel.setForeground(AppTheme.HIGH_LEVEL_COLOR);
        }

        // Properti tambahan 1:
        // tooltip berisi detail karakter
        card.setToolTipText(
                "<html>"
                + "<b>" + character.getName() + "</b><br>"
                + "Role: " + type + "<br>"
                + "Level: " + character.getLevel() + "<br>"
                + "HP: " + character.getHitPoints() + "<br>"
                + "ATK: " + character.getAttack() + "<br>"
                + "Mana: " + character.getMana()
                + "</html>"
        );

        card.add(nameLabel);
        card.add(typeLabel);
        card.add(levelLabel);

        return card;
    }
}
