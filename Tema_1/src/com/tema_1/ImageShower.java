package com.tema_1;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageShower {

    static String colour;
    static String company;
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

        final JButton buttonRed = new JButton("Red");
        buttonRed.addActionListener(e -> {
            lbl.setIcon(new ImageIcon("Images\\masina_red.jpg"));
            colour = "red";

        });
        final JButton buttonGreen = new JButton("Green");
        buttonGreen.addActionListener(e -> {
            lbl.setIcon(new ImageIcon("Images\\masina_green.jpg"));
            colour = "green";
        });

        final JButton buttonBlue = new JButton("Blue");
        buttonBlue.addActionListener(e -> {
            lbl.setIcon(new ImageIcon("Images\\masina_blue.jpg"));
            colour = "blue";
        });
        final JButton buttonNext = new JButton("Next ->");
        buttonNext.addActionListener(e -> {
            if (colour != null) {
                JFrame window1 = new JFrame("Choose the brand");
                window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel_2 = new JPanel();
                window1.add(BorderLayout.NORTH, panel_2);

                ImageIcon p2 = new ImageIcon();
                BufferedImage img2 = null;
                try {
                    img2 = ImageIO.read(new File(String.format("Images\\masina_%s.jpg", colour)));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

                JLabel lbl1 = new JLabel();
                p2.setImage(img2);
                lbl1.setIcon(p2);

                final JButton buttonMercedes = new JButton("Mercedes");
                buttonMercedes.addActionListener(e1 -> {
                    company = "mercedes";

                    BufferedImage finalImg;
                    BufferedImage imgCar = null, imgColour = null;
                    try {
                        imgCar = ImageIO.read(new File("Images\\sigla_mercedes.jpg"));
                        imgColour = ImageIO.read(new File(String.format("Images\\masina_%s.jpg", colour)));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    finalImg = new BufferedImage(imgColour.getWidth(), imgColour.getHeight(), BufferedImage.TYPE_INT_ARGB);

                    Graphics g = finalImg.getGraphics();
                    g.drawImage(imgColour, 0, 0, null);
                    g.drawImage(imgCar, 0, 0, null);

                    lbl1.setIcon(new ImageIcon(finalImg));
                });

                final JButton buttonAudi = new JButton("Audi");
                buttonAudi.addActionListener(e12 -> {
                    company = "audi";

                    BufferedImage finalImg;
                    BufferedImage imgCar = null, imgColour = null;
                    try {
                        imgCar = ImageIO.read(new File("Images\\sigla_audi.jpg"));
                        imgColour = ImageIO.read(new File(String.format("Images\\masina_%s.jpg", colour)));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    finalImg = new BufferedImage(imgColour.getWidth(), imgColour.getHeight(), BufferedImage.TYPE_INT_ARGB);

                    Graphics g = finalImg.getGraphics();
                    g.drawImage(imgColour, 0, 0, null);
                    g.drawImage(imgCar, 0, 0, null);

                    lbl1.setIcon(new ImageIcon(finalImg));
                });

                final JButton buttonBMW = new JButton("BMW");
                buttonBMW.addActionListener(e13 -> {
                    company = "BMW";

                    BufferedImage finalImg;
                    BufferedImage imgCar = null, imgColour = null;
                    try {
                        imgCar = ImageIO.read(new File("Images\\sigla_bmw.jpg"));
                        imgColour = ImageIO.read(new File(String.format("Images\\masina_%s.jpg", colour)));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    finalImg = new BufferedImage(imgColour.getWidth(), imgColour.getHeight(), BufferedImage.TYPE_INT_ARGB);

                    Graphics g = finalImg.getGraphics();
                    g.drawImage(imgColour, 0, 0, null);
                    g.drawImage(imgCar, 0, 0, null);

                    lbl1.setIcon(new ImageIcon(finalImg));
                });

                final JButton buttonNext2 = new JButton("Next ->");
                buttonNext2.addActionListener(e14 -> {
                    Marca car = createCar(colour, company);
                    JFrame window3 = new JFrame("See your car");
                    window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel panel_3 = new JPanel();
                    window3.add(BorderLayout.NORTH, panel_3);

                    ImageIcon p3 = new ImageIcon();
                    BufferedImage img3 = null;
                    try {
                        BufferedImage imgCompany = ImageIO.read(new File(String.format("Images\\sigla_%s.jpg", company)));
                        BufferedImage imgCar = ImageIO.read(new File(String.format("Images\\masina_%s.jpg", colour)));
                        img3 = new BufferedImage(imgCar.getWidth(), imgCar.getHeight(), BufferedImage.TYPE_INT_ARGB);

                        Graphics g = img3.getGraphics();
                        g.drawImage(imgCar, 0, 0, null);
                        g.drawImage(imgCompany, 0, 0, null);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    JLabel lbl11 = new JLabel();
                    p3.setImage(img3);
                    lbl11.setIcon(p3);
                    lbl11.setPreferredSize(new Dimension(300, 150));
                    JPanel buttons = new JPanel(new GridLayout(0, 1));

                    JLabel labelCompany = new JLabel("Company: " + car.getCompany());
                    JLabel labelPower = new JLabel("CP: " + car.getCP());
                    JLabel labelMaxSpeed = new JLabel("Max speed: " + car.getMaxSpeed());

                    buttons.add(lbl11);
                    buttons.add(labelCompany);
                    buttons.add(labelPower);
                    buttons.add(labelMaxSpeed);

                    JPanel right = new JPanel(new BorderLayout());
                    right.add(buttons, BorderLayout.NORTH);
                    panel_3.add(right, BorderLayout.EAST);
                    window3.setSize(500, 1000);
                    window3.setVisible(true);
                    window3.setLocationRelativeTo(null);
                });
                lbl1.setPreferredSize(new Dimension(300, 150));
                JPanel buttons = new JPanel(new GridLayout(0, 1));

                buttons.add(lbl1);

                buttons.add(buttonMercedes);
                buttons.add(buttonAudi);
                buttons.add(buttonBMW);
                buttons.add(buttonNext2);


                JPanel right = new JPanel(new BorderLayout());
                right.add(buttons, BorderLayout.NORTH);
                panel_2.add(right, BorderLayout.EAST);
                window1.setSize(500, 1000);
                window1.setVisible(true);
                window1.setLocationRelativeTo(null);
            }
            else {
                JOptionPane.showMessageDialog(window, "You are supposed to select a colour.");
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

    public static Marca createCar(String colour, String company) {
        Marca car;
        switch (colour) {
            case "red":
                car = new RedCarDecorator(company.equals("mercedes") ? new Mercedes() : company.equals("audi") ? new Audi() : new BMW());
                break;
            case "blue":
                car = new BlueCarDecorator(company.equals("mercedes") ? new Mercedes() : company.equals("audi") ? new Audi() : new BMW());
                break;
            case "green":
                car = new GreenCarDecorator(company.equals("mercedes") ? new Mercedes() : company.equals("audi") ? new Audi() : new BMW());
                break;
            default:
                car = new RedCarDecorator(company.equals("mercedes") ? new Mercedes() : company.equals("audi") ? new Audi() : new BMW());
        }
        return car;
    }
}