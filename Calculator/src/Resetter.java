
import java.awt.event.*;
import javax.swing.*;

public class Resetter implements ActionListener {

    private final Calculator c;
    private final JTextField a;
    private final JTextField b;
    private final JButton res;

    public Resetter(Calculator c, JTextField a, JTextField b, JButton res) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.res = res;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            this.c.reset();
            this.a.setText("");

            this.b.setText(String.valueOf(this.c.getVal()));

            res.setEnabled(false);
            
        } catch (NumberFormatException ex) {
            this.a.setText("");
        }
    }

}
