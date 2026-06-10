package REP13;

import javax.swing.*;
import java.awt.*;

public class BinaryOctalConverter1 extends JFrame {

    private JTextField inputField;
    private JTextField resultField;
    private JButton binaryBtn;
    private JButton octalBtn;
    private JButton clearBtn;

    public BinaryOctalConverter1() {
        setTitle("Binary/Octal convertor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(2, 1)); // 2행 1열

        inputField = new JTextField("Enter value here");
        resultField = new JTextField();
        resultField.setEditable(false);

        leftPanel.add(inputField);
        leftPanel.add(resultField);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));

        binaryBtn = new JButton("Convert to binary");
        octalBtn = new JButton("Convert to octal");
        clearBtn = new JButton("Clear");

        rightPanel.add(binaryBtn);
        rightPanel.add(octalBtn);
        rightPanel.add(clearBtn);

        add(leftPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);

        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BinaryOctalConverter1();
    }
}