package com.tema_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageShower {

    static String culoare;
    static String firma;
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame window = new JFrame("Image showing program");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel_1 = new JPanel();
        window.add(BorderLayout.NORTH, panel_1);

        ImageIcon p = new ImageIcon();
        BufferedImage img = ImageIO.read(new File("Images\\masina_white.jpg"));
        JLabel lbl = new JLabel();
        p.setImage(img);
        lbl.setIcon(p);

        final JButton buttonRed = new JButton("Rosu");
        buttonRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setIcon(new ImageIcon("Images\\masina_red.jpg"));
                culoare = "red";

            }
        });
        final JButton buttonGreen = new JButton("Verde");
        buttonGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setIcon(new ImageIcon("Images\\masina_green.jpg"));
                culoare = "green";
            }
        });

        final JButton buttonBlue = new JButton("Albastru");
        buttonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setIcon(new ImageIcon("Images\\masina_blue.jpg"));
                culoare = "blue";
            }
        });
        final JButton buttonNext = new JButton("Next ->");
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (culoare != null) {
                    JFrame window = new JFrame("Choose the brand");
                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel panel_2 = new JPanel();
                    window.add(BorderLayout.NORTH, panel_2);

                    final JButton buttonMercedes = new JButton("Mercedes");
                    buttonMercedes.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            firma = "mercedes";
                        }
                    });
                    final JButton buttonAudi = new JButton("Audi");
                    buttonAudi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            firma = "audi";
                        }
                    });
                    ImageIcon p2 = new ImageIcon();
                    BufferedImage img2 = null;
                    switch (culoare) {
                        case "red":
                            try {
                                img2 = ImageIO.read(new File("Images\\masina_red.jpg"));
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            break;
                        case "blue":
                            try {
                                img2 = ImageIO.read(new File("Images\\masina_blue.jpg"));
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            break;
                        case "green":
                            try {
                                img2 = ImageIO.read(new File("Images\\masina_green.jpg"));
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            break;
                        default:
                            try {
                                img2 = ImageIO.read(new File("Images\\masina_white.jpg"));
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                    }
                    final JButton buttonBMW = new JButton("BMW");
                    buttonBMW.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            firma = "BMW";
                        }
                    });
                    final JButton buttonNext2 = new JButton("Next ->");
                    buttonNext2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Marca car = createCar(culoare, firma);
                            JFrame window3 = new JFrame("See your car");
                            window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                            JPanel panel_3 = new JPanel();
                            window3.add(BorderLayout.NORTH, panel_3);

                            ImageIcon p3 = new ImageIcon();
                            BufferedImage img3 = null;
                            try {
                                img3 = ImageIO.read(new File(String.format("Images\\masina_%s.jpg", culoare)));
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            }
                            JLabel lbl = new JLabel();
                            p3.setImage(img3);
                            lbl.setIcon(p3);
                            lbl.setPreferredSize(new Dimension(300, 150));
                            JPanel buttons = new JPanel(new GridLayout(0, 1));

                            JLabel labelFirma = new JLabel("Marca este: " + car.getFirma());
                            JLabel labelPutere = new JLabel("Numarul de cai putere este: " + String.valueOf(car.getCP()));
                            JLabel labelVitezaMax = new JLabel("Viteza maxima este: " + String.valueOf(car.getMaxVit()));

                            buttons.add(lbl);
                            buttons.add(labelFirma);
                            buttons.add(labelPutere);
                            buttons.add(labelVitezaMax);

                            JPanel right = new JPanel(new BorderLayout());
                            right.add(buttons, BorderLayout.NORTH);
                            panel_3.add(right, BorderLayout.EAST);
                            window3.setSize(500, 1000);
                            window3.setVisible(true);
                            window3.setLocationRelativeTo(null);
                        }
                    });
                    JLabel lbl = new JLabel();
                    p2.setImage(img2);
                    lbl.setIcon(p2);
                    lbl.setPreferredSize(new Dimension(300, 150));
                    JPanel buttons = new JPanel(new GridLayout(0, 1));

                    buttons.add(lbl);

                    buttons.add(buttonMercedes);
                    buttons.add(buttonAudi);
                    buttons.add(buttonBMW);
                    buttons.add(buttonNext2);


                    JPanel right = new JPanel(new BorderLayout());
                    right.add(buttons, BorderLayout.NORTH);
                    panel_2.add(right, BorderLayout.EAST);
                    window.setSize(500, 1000);
                    window.setVisible(true);
                    window.setLocationRelativeTo(null);
                }
                else {
                    JOptionPane.showMessageDialog(window, "You are supposed to select a colour.");
                }
            }
        });


        lbl.setPreferredSize(new Dimension(300, 150));
        JPanel buttons = new JPanel(new GridLayout(0, 1));

        buttons.add(lbl);

        buttons.add(buttonRed);
        buttons.add(buttonGreen);
        buttons.add(buttonBlue);
        buttons.add(buttonNext);



        JPanel right = new JPanel(new BorderLayout());
        right.add(buttons, BorderLayout.NORTH);
        panel_1.add(right, BorderLayout.EAST);
        window.setSize(500, 1000);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static Marca createCar(String culoare, String firma) {
        Marca car;
        switch (culoare) {
            case "red":
                car = new RedCarDecorator(firma.equals("mercedes") ? new Mercedes() : firma.equals("audi") ? new Audi() : new BMW());
                break;
            case "blue":
                car = new BlueCarDecorator(firma.equals("mercedes") ? new Mercedes() : firma.equals("audi") ? new Audi() : new BMW());
                break;
            case "green":
                car = new GreenCarDecorator(firma.equals("mercedes") ? new Mercedes() : firma.equals("audi") ? new Audi() : new BMW());
                break;
            default:
                car = new RedCarDecorator(firma.equals("mercedes") ? new Mercedes() : firma.equals("audi") ? new Audi() : new BMW());
        }
        return car;
    }
}