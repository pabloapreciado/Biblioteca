package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbColor;
    private JLabel lbPosX;
    private JLabel lbPosD;
    private JLabel lbPosY;
    private JLabel lbPosP;
    private JTextField tfColor;
    private JTextField tfPosX;
    private JTextField tfPosD;
    private JComboBox tfPosY;
    private JComboBox tfPosP;

    
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        //iImagen = new ImageIcon(getClass().getResource("/vista/carro.png"));
        //lbImagen = new JLabel(iImagen);
        //lbImagen.setBounds(10,10,220,176);
        //add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbColor = new JLabel("Titulo = ");
        lbColor.setBounds(30,20,200,20);
        add(lbColor);
        
        lbPosX = new JLabel("Autor = ");
        lbPosX.setBounds(30,40,60,20);
        add(lbPosX);
        
        lbPosD = new JLabel("Año de edicion = ");
        lbPosD.setBounds(30,60,100,20);
        add(lbPosD);

        lbPosY = new JLabel("lujo = ");
        lbPosY.setBounds(30,80,100,20);
        add(lbPosY);
        
        
        //Creación y adición de campos de texto
        tfColor = new JTextField("Title");
        tfColor.setBounds(200, 20, 100, 20);
        add(tfColor);
        
        tfPosX = new JTextField("Autor");
        tfPosX.setBounds(200, 40, 100, 20);
        add(tfPosX);
        
        tfPosD = new JTextField("Año Edicion");
        tfPosD.setBounds(200, 60, 100, 20);
        add(tfPosD);

    
        //Creación e inserción del combo
        tfPosY = new JComboBox();
        String[] lista = {"Lujo","No es de lujo"};
        
        for(int i=0; i<lista.length;i++)
        {
            tfPosY.addItem(lista[i]);
        }
        tfPosY.setBounds(200, 80, 100, 20);
        add(tfPosY);


        tfPosP = new JComboBox();
        String[] lista1 = {"Lujo","No es de lujo"};
        
        for(int i=0; i<lista1.length;i++)
        {
            tfPosP.addItem(lista1[i]);
        }
        tfPosP.setBounds(200, 100, 100, 20);
        add(tfPosY);

        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Del Libro");
        borde.setTitleColor(Color.black);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getColor()
    {
        return tfColor.getText();
    }
    
    public String getPosX()
    {
        return tfPosX.getText();
    }
    public String getPosD()
    {
        return tfPosD.getText();
    }
    
    public String getPosY()
    {
        return tfPosY.getToolTipText();
    }
    
        
    public String getPosP()
    {
        return tfPosP.getToolTipText();
    }
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfColor.setText("");
        tfPosX.setText("");
        tfPosD.setText("");
        tfPosY.getToolTipText();
        tfPosP.getToolTipText();
    }

    public void setColor(javafx.scene.paint.Color black) {
    }

    public void add(Color color) {
    }
}