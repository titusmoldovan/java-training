package app.view;

import javax.swing.*;
import java.awt.*;

public class TestFrame extends JFrame implements Cloneable {
    private JPanel mainPanel;
    private JButton button1;
    private JLabel label;
    private JPanel pan1;
    private JPanel pan2;
    private JPanel pan3;

    private String frameTitle;
    private Color backgroundColor;
    private String text;
    private String font;
    private int size;
    private Color colorOfText;

    private TestFrame(Builder builder) {
        super();
        this.frameTitle = builder.frameTitle;
        this.backgroundColor = builder.backgroundColor;
        this.text = builder.text;
        this.font = builder.font;
        this.size = builder.size;
        this.colorOfText = builder.colorOfText;
    }

    private void initialize() {
        this.add(mainPanel);
        this.setSize(300, 450);
        this.setTitle(frameTitle);
        this.pan1.setBackground(backgroundColor);
        this.pan2.setBackground(backgroundColor);
        this.pan3.setBackground(backgroundColor);
        this.label.setText(text);
        this.label.setFont(new Font(font, 0, size));
        this.label.setForeground(colorOfText);
        this.setVisible(true);
        initialiListener();
    }

    public static class Builder {
        private String frameTitle;
        private Color backgroundColor;
        private String text;
        private String font;
        private int size;
        private Color colorOfText;

        public Builder() {
            this.frameTitle = "No Title";
            this.backgroundColor = Color.LIGHT_GRAY;
            this.text = "No text";
            this.font = "Serif";
            this.size = 10;
            this.colorOfText = Color.BLACK;
        }

        public Builder setTitle(String title) {
            this.frameTitle = title;
            return this;
        }

        public Builder setBackgroundColor(Color color) {
            this.backgroundColor = color;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setFont(String string) {
            this.font = string;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setColorOfText(Color color) {
            this.colorOfText = color;
            return this;
        }

        public TestFrame build() {
            TestFrame frame = new TestFrame(this);
            frame.initialize();
            return frame;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        TestFrame testFrame = (TestFrame) super.clone();
        return testFrame;
    }

    private void initialiListener() {
        button1.addActionListener(e -> {
            try {
                TestFrame cloned = ((TestFrame) clone());
                cloned.initialize();
                System.out.println(this.equals(cloned));
            } catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
            }
        });
    }
}
