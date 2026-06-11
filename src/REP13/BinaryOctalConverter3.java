package REP13;

import javax.swing.*;
import java.awt.*;

public class BinaryOctalConverter3 extends JFrame {

    private JTextField inputField;
    private JTextField resultField;
    private JButton binaryBtn;
    private JButton octalBtn;
    private JButton clearBtn;

    public BinaryOctalConverter3() {
        setTitle("Binary/Octal convertor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField("Enter value here");
        resultField = new JTextField();
        resultField.setEditable(false);

        JPanel leftPanel = new JPanel(new GridLayout(2, 1));
        leftPanel.add(inputField);
        leftPanel.add(resultField);

        binaryBtn = new JButton("Convert to binary");
        octalBtn = new JButton("Convert to octal");
        clearBtn = new JButton("Clear");

        JPanel rightPanel = new JPanel(new GridLayout(3, 1));
        rightPanel.add(binaryBtn);
        rightPanel.add(octalBtn);
        rightPanel.add(clearBtn);

        add(leftPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);
        binaryBtn.addActionListener(e -> {
            String input = inputField.getText().trim();
            // 8진수 검증: 0~7 숫자만 허용
            if (!input.matches("[0-7]+")) {
                resultField.setText("Sorry, can not convert that.");
                return;
            }
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                int n = input.charAt(i) - '0';
                if (n == 0) result += "000";
                else if (n == 1) result += "001";
                else if (n == 2) result += "010";
                else if (n == 3) result += "011";
                else if (n == 4) result += "100";
                else if (n == 5) result += "101";
                else if (n == 6) result += "110";
                else if (n == 7) result += "111";
            }
            resultField.setText(result);
        });

        octalBtn.addActionListener(e -> {
            String input = inputField.getText().trim();
            if (!input.matches("[01]+")) {
                resultField.setText("Sorry, can not convert that.");
                return;
            }
            while (input.length() % 3 != 0) {
                input = "0" + input;
            }
            String result = "";
            for (int i = 0; i < input.length(); i += 3) {
                String group = input.substring(i, i + 3);
                if (group.equals("000")) result += "0";
                else if (group.equals("001")) result += "1";
                else if (group.equals("010")) result += "2";
                else if (group.equals("011")) result += "3";
                else if (group.equals("100")) result += "4";
                else if (group.equals("101")) result += "5";
                else if (group.equals("110")) result += "6";
                else if (group.equals("111")) result += "7";
            }
            resultField.setText(result);
        });

        clearBtn.addActionListener(e -> {
            inputField.setText("");
            resultField.setText("");
        });

        setSize(400, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BinaryOctalConverter3();
    }
}