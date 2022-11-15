package u29_mouse_events;

public abstract class ObservableProperty {

    private ChangeListener listener;

    public void setListener(ChangeListener listener) {
        this.listener= listener;
    }

    protected void changedEvent() {
        if (listener != null) {
            listener.changed(this);
        }
    }

    public abstract String getValue();

}
