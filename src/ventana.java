import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ventana extends JFrame{
    private JPanel panel;
    private JTextField caja_texto_1;
    private JButton boton_saludar;
    private JLabel numero_1;
    private JLabel numero_2;
    private JButton sumar;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtresultado;
    private JButton suma;
    private JButton resta;
    private JButton multiplicar;
    private JButton dividir;


    public ventana() {

        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum1.setBackground(Color.CYAN);
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum1.setBackground(Color.white);
            }
        });

        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double resultadoResta = num1 - num2;
                txtresultado.setText(String.valueOf(resultadoResta));
            }
        });
        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double RE_multiplicacion = num1 * num2;
                txtresultado.setText(String.valueOf(RE_multiplicacion));
            }
        });
        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double RE_divicion = num1 / num2;
                txtresultado.setText(String.valueOf(RE_divicion));
            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());
                double RE_suma = num1 + num2;
                txtresultado.setText(String.valueOf(RE_suma));
            }
        });
    }

    public static void main(String[] args) {
        ventana caja =new ventana();
        caja.setContentPane(caja.panel);
        caja.setSize(500,500);
        caja.setVisible(true);
        caja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
