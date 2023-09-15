import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener
{
    JLabel  display;
    JFrame jf;
    JButton sevenbutton;
    JButton eightbutton;
    JButton ninebutton;
    JButton fourbutton;
    JButton fivebutton;
    JButton sixbutton;
    JButton onebutton;
    JButton twobutton;
    JButton threebutton;
    JButton dotbutton;
    JButton zerobutton;
    JButton equalbutton;
    JButton plusbutton;
    JButton mulbutton;
    JButton divbutton;
    JButton minbutton;
    JButton clearbutton;
    public  Calculator()
    {
        jf =new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500, 600);
        jf.setLocation(100,100);
        display=new JLabel(null, null, 0);

        display.setBounds(30, 50, 450, 40);
        jf.add(display);
        display.setBackground(Color.gray);
        display.setOpaque(true);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.white);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        sevenbutton = new JButton("7");
        sevenbutton.setBounds(30, 120 , 80, 80);
        sevenbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(sevenbutton);
        sevenbutton.addActionListener(this);

        eightbutton = new JButton("8");
        eightbutton.setBounds(130, 120 , 80, 80);
        eightbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(eightbutton);
        eightbutton.addActionListener(this);

        ninebutton = new JButton("9");
        ninebutton.setBounds(230, 120 , 80, 80);
        ninebutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(ninebutton);
        ninebutton.addActionListener(this);

        fourbutton = new JButton("4");
        fourbutton.setBounds(30, 220 , 80, 80);
        fourbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(fourbutton);
        fourbutton.addActionListener(this);

        fivebutton = new JButton("5");
        fivebutton.setBounds(130, 220 , 80, 80);
        fivebutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(fivebutton);
        fivebutton.addActionListener(this);

        sixbutton = new JButton("6");
        sixbutton.setBounds(230, 220 , 80, 80);
        sixbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(sixbutton);
        sixbutton.addActionListener(this);


        onebutton = new JButton("1");
        onebutton.setBounds(30, 320 , 80, 80);
        onebutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(onebutton);
        onebutton.addActionListener(this);

        twobutton = new JButton("2");
        twobutton.setBounds(130, 320 , 80, 80);
        twobutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(twobutton);
        twobutton.addActionListener(this);

        threebutton = new JButton("3");
        threebutton.setBounds(230, 320 , 80, 80);
        threebutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(threebutton);
        threebutton.addActionListener(this);

        dotbutton = new JButton(".");
        dotbutton.setBounds(30, 420 , 80, 80);
        dotbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(dotbutton);
        dotbutton.addActionListener(this);

        zerobutton = new JButton("0");
        zerobutton.setBounds(130, 420 , 80, 80);
        zerobutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(zerobutton);
        zerobutton.addActionListener(this);

        equalbutton = new JButton("=");
        equalbutton.setBounds(230, 420 , 80, 80);
        equalbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(equalbutton);
        equalbutton.addActionListener(this);



        plusbutton = new JButton("+");
        plusbutton.setBounds(330, 120 , 80, 80);
        plusbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(plusbutton);
        plusbutton.addActionListener(this);

        mulbutton = new JButton("x");
        mulbutton.setBounds(330, 220 , 80, 80);
        mulbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(mulbutton);
        mulbutton.addActionListener(this);

        divbutton = new JButton("/");
        divbutton.setBounds(330, 320 , 80, 80);
        divbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(divbutton);
        divbutton.addActionListener(this);

        minbutton = new JButton("-");
        minbutton.setBounds(330, 420 , 80, 80);
        minbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(minbutton);
        minbutton.addActionListener(this);

        clearbutton= new JButton("AC", null);
        clearbutton.setBounds(170,520,100,40);
        clearbutton.setFont(new Font("Ariel",Font.PLAIN,30));
        jf.add(clearbutton);
        clearbutton.addActionListener(this);






    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== sevenbutton)
        {
            if(display.getText()==null)
            {
                display.setText("7");
            }
            else
            {
                display.setText(display.getText()+"7");
            }
        }
        else if(e.getSource()==eightbutton)
        {
            if(display.getText()==null)
            {
                display.setText("8");
            }
            else
            {
                display.setText(display.getText()+"8");
            }
        }
        else if(e.getSource()==ninebutton)
            if(display.getText()==null)
            {
                display.setText("9");
            }
            else
            {
                display.setText(display.getText()+"9");
            }
        else if(e.getSource()==fourbutton)
            if(display.getText()==null)
            {
                display.setText("4");
            }
            else
            {
                display.setText(display.getText()+"4");
            }
        else if(e.getSource()==fivebutton)
            if(display.getText()==null)
            {
                display.setText("5");
            }
            else
            {
                display.setText(display.getText()+"5");
            }
        else if(e.getSource()==sixbutton)
        {
            if(display.getText()==null)
            {
                display.setText("6");
            }
            else
            {
                display.setText(display.getText()+"6");
            }
        }
        else if(e.getSource()==threebutton)
            if(display.getText()==null)
            {
                display.setText("3");
            }
            else
            {
                display.setText(display.getText()+"3");
            }
        else if(e.getSource()==twobutton)
            if(display.getText()==null)
            {
                display.setText("2");
            }
            else
            {
                display.setText(display.getText()+"2");
            }
        else if(e.getSource()==onebutton)
            if(display.getText()==null)
            {
                display.setText("1");
            }
            else
            {
                display.setText(display.getText()+"1");
            }
        else if(e.getSource()==plusbutton)
            if(display.getText()==null)
            {
                display.setText("+");
            }
            else
            {
                display.setText(display.getText()+"+");
            }
        else if(e.getSource()==minbutton)
            if(display.getText()==null)
            {
                display.setText("-");
            }
            else
            {
                display.setText(display.getText()+"-");
            }
        else if(e.getSource()==zerobutton)
        {
            if(display.getText()==null)
            {
                display.setText("0");
            }
            else
            {
                display.setText(display.getText()+"0");
            }
        }
        else if(e.getSource()==divbutton)
        {
            display.setText("/");
        }
        else if(e.getSource()==dotbutton)
            if(display.getText()==null)
            {
                display.setText("0.");
            }
            else
            {
                display.setText(display.getText()+".");
            }
        else if(e.getSource()==equalbutton)
        {
            display.setText("=");
        }
        else if(e.getSource()==mulbutton)
        {
            display.setText("x");
        }
        else
        {
            display.setText("");
        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}