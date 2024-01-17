package proyectoEntornos;

/** VasAVenir.java es una ventana simple con dos botones para comprobar si vas a venir o no
 * 
 * @author Manuel Santos Márquez
 * @version 17/01/2024
 */

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VasAVenir extends JFrame {
	
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton botonSi;
    private JButton btnNo;

    /**
     * main es donde corre la ventana principal
     * 
     * @param args		Argumentos pasados a la funcion main (String)
     * 
     */
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VasAVenir frame = new VasAVenir();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VasAVenir() {
        setTitle("¿VAS A VENIR O NO?");
        setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 630);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 170));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        botonSi = new JButton("SI");
        botonSi.addActionListener(new ActionListener() {
        	/**
        	 * actionPerformed realiza una acción al pulsar en un botón
        	 * 
        	 * @param e		Parametro pasado a la función 
        	 */
        	public void actionPerformed(ActionEvent e) {
        		try {
        			DialogoVasAVenir dialog = new DialogoVasAVenir();
        			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        			dialog.setVisible(true);
        		} catch (Exception e1) {
        			e1.printStackTrace();
        		}
        	}
        });
        botonSi.setBackground(new Color(0, 255, 0));
        botonSi.setFont(new Font("Comic Sans MS", Font.BOLD, 40));

        btnNo = new JButton("NO");
        btnNo.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        btnNo.setBackground(new Color(255, 0, 0));
        btnNo.addMouseListener(new MouseAdapter() {
        	/**
        	 * mouseEntered función que mueve un botón a una posición aleatoria cuando se pasa por encima
        	 * 
        	 * @param e		Parametro pasado a la función
        	 */
            @Override
            public void mouseEntered(MouseEvent e) {
                // Mueve el botón "NO" a una posición aleatoria cuando el ratón pasa por encima
                Random rand = new Random();
                int x = rand.nextInt(contentPane.getWidth() - btnNo.getWidth());
                int y = rand.nextInt(contentPane.getHeight() - btnNo.getHeight());
                btnNo.setLocation(x, y);
            }
        });

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                    .addContainerGap(220, Short.MAX_VALUE)
                    .addComponent(botonSi, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                    .addGap(100)
                    .addComponent(btnNo, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                    .addGap(202))
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(botonSi, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addGap(236))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
