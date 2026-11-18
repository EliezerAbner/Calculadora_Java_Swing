import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args)
    {
        JFrame janela = new JFrame("Calculadora");
        janela.setLayout(new GridLayout(5, 4, 5, 5));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel lblTexto = new JLabel("teste");
        janela.add(lblTexto, gbc);

        JButton[] botoes =
        {
            new JButton("7"),
            new JButton("8"),
            new JButton("9"),
            new JButton("X"),
            new JButton("4"),
            new JButton("5"),
            new JButton("6"),
            new JButton("-"),
            new JButton("1"),
            new JButton("2"),
            new JButton("3"),
            new JButton("+"),
            new JButton("0"),
            new JButton("/"),
            new JButton("="),
        };

        for(JButton button : botoes)
        {
            int gridX = 0;
            int gridY = 1;
            button.addActionListener(e ->
                    System.out.println(button.getText()));

            janela.add(button, gbc);
        }

        janela.setSize(240, 320);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);


        // Torna a janela visível
        janela.setVisible(true);

    }
}