
import java.awt.event.*;
import javax.swing.*;

public class Adder implements ActionListener {

    private final Calculator c;
    private final JTextField a;
    private final JTextField b;
    private final JButton res;

    public Adder(Calculator c, JTextField a, JTextField b, JButton res) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.res = res;
    }

    // textfield 'a' is the input
    // textfield 'b' is the output
    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            int num = Integer.parseInt(a.getText());
            this.c.add(num);
            this.a.setText("");

            this.b.setText(String.valueOf(this.c.getVal()));

            if (c.getVal() == 0) {

                res.setEnabled(false);
            } else {

                res.setEnabled(true);
            }

        } catch (NumberFormatException ex) {
            this.a.setText("");
        }

    }

}
