package u24;

/**
 * Listener zugeordnet mit
 * lokaler Klasse Doorbell
 */
public class BellMain {
    public static void main(String[] args) {
        BellButton btn = new BellButton();

        class DoorBell implements ChangeListener {
            @Override
            public void changed(ObservableProperty observable) {
                btn.setListener(new DoorBell());
                System.out.println(btn.getValue());
            }
        }

        btn.setListener(new DoorBell());

        btn.press();
        btn.release();
        btn.press();
        btn.release();
    }
}
