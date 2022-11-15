package u24;

/**
 * Listener zugeordnet mit
 * anonymer klasse
 */
public class BellMain2 {
    public static void main(String[] args) {
        BellButton btn = new BellButton();
        ChangeListener cL=
                new ChangeListener() {
            BellButton btn;
            @Override
            public void changed(ObservableProperty observable) {
                btn.getValue();
            }
        };

        btn.press();
        btn.release();
        btn.press();
        btn.release();
    }
}
