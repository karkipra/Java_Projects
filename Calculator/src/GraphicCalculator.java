
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        //layout
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        //top two components
        JTextField one = new JTextField("0");
        one.setEnabled(false);
        container.add(one);

        JTextField two = new JTextField("");
        container.add(two);

        //JPanel here for calculations
        JPanel tools = new JPanel(new GridLayout(1, 3));

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton res = new JButton("Z");
        res.setEnabled(false);

        tools.add(add);
        tools.add(sub);
        tools.add(res);

        container.add(tools);

        //Adding calculator and implementation
        Calculator c = new Calculator(0);

        /*
        if(c.getVal() == 0){
            res.setEnabled(false);
        } else {
            res.setEnabled(true);
        } 
         */
        
        add.addActionListener(new Adder(c, two, one, res));
        
        sub.addActionListener(new Subtracter(c, two, one, res));
        
        res.addActionListener(new Resetter(c, two, one, res));


    }

    public JFrame getFrame() {
        return frame;
    }


}
