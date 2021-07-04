package app.view;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField frameTitleField;
    private JComboBox backgroundColorcombo;
    private JTextField textField;
    private JComboBox fontCombo;
    private JComboBox sizeCombo;
    private JComboBox colorOfTextCombo;
    private JButton OKButton;
    private JButton cancenButton;

    public MainFrame() {
    }

    public void initialize() {
        this.add(mainPanel);
        this.setBounds(300, 200, 550, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComboBox();
        initializeListeners();
        this.setVisible(true);
    }

    private void initializeComboBox() {
        Arrays.stream(Colors.values())
                .map(Enum::toString)
                .collect(Collectors.toList())
                .forEach(x -> {
                    backgroundColorcombo.addItem(x);
                    colorOfTextCombo.addItem(x);
                });

        backgroundColorcombo.setSelectedIndex(2);
        colorOfTextCombo.setSelectedIndex(4);

        for (int i = 10; i < 33; i += 2) {
            sizeCombo.addItem(i);
        }

        List.of(FontTest.values()).stream()
                .map(FontTest::name)
                .collect(Collectors.toList())
                .forEach(x -> {
                    fontCombo.addItem(x);
                });
    }

    private void initializeListeners() {

        cancenButton.addActionListener(e -> {
            this.dispose();
        });

        OKButton.addActionListener(e -> {
            String frameTitle = this.frameTitleField.getText();

            String aux = this.backgroundColorcombo.getSelectedItem().toString();
            Color backgroundColor = getColor(Colors.valueOf(aux));

            String text = this.textField.getText();
            String font = this.fontCombo.getSelectedItem().toString();
            int size = Integer.parseInt(this.sizeCombo.getSelectedItem().toString());

            aux = colorOfTextCombo.getSelectedItem().toString();
            Color colorText = getColor(Colors.valueOf(aux));

            createNewWindow(frameTitle, backgroundColor, text, font, size, colorText);
        });
    }

    private void createNewWindow(String frameTitle, Color backgroundColor, String text, String font,
                                 int size, Color colorText) {
        TestFrame.Builder builderFrame = new TestFrame.Builder();
        if (!(frameTitle.isBlank())) {
            builderFrame = builderFrame.setTitle(frameTitle);
        }
        if (!(text.isBlank())) {
            builderFrame = builderFrame.setText(text);
        }
        if (!("Serif".equals(font))) {
            builderFrame = builderFrame.setFont(font);
        }
        if (size != 10) {
            builderFrame = builderFrame.setSize(size);
        }
        if (!(Color.LIGHT_GRAY.equals(backgroundColor))) {
            builderFrame = builderFrame.setBackgroundColor(backgroundColor);
        }
        if (!(Color.BLACK.equals(colorText))) {
            builderFrame = builderFrame.setColorOfText(colorText);
        }
        builderFrame.build();
    }

    private Color getColor(Colors colorEnum) {
        Color color;
        switch (colorEnum) {
            case WHITE:
                color = Color.WHITE;
                break;
            case LIGHT_GRAY:
                color = Color.LIGHT_GRAY;
                break;
            case GRAY:
                color = Color.GRAY;
                break;
            case DARK_GRAY:
                color = Color.DARK_GRAY;
                break;
            case RED:
                color = Color.RED;
                break;
            case PINK:
                color = Color.PINK;
                break;
            case ORANGE:
                color = Color.ORANGE;
                break;
            case YELLOW:
                color = Color.YELLOW;
                break;
            case GREEN:
                color = Color.GREEN;
                break;
            case MAGENTA:
                color = Color.MAGENTA;
                break;
            case CYAN:
                color = Color.CYAN;
                break;
            case BLUE:
                color = Color.BLUE;
                break;
            default:
                color = Color.BLACK;
        }
        return color;
    }
}
