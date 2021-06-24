package templatemethod;

public abstract class Record {
    public final void save() {
        if (this.validate()) {
            this.beforeSave();
            // Save
            this.afterSave();
        } else {
            this.onValidateError();
        }
    }

    public void beforeSave() {

    }

    public void afterSave() {

    }

    public abstract boolean validate();

    public abstract void onValidateError();
}
