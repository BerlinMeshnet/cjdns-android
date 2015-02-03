package berlin.meshnet.cjdns.model;

/**
 * Model for credential.
 */
public class Credential {

    public final String label;

    public final Protocol protocol;

    public final String password;

    private boolean isAllowed;

    public Credential(String label, Protocol protocol, String password, boolean isAllowed) {
        this.label = label;
        this.protocol = protocol;
        this.password = password;
        this.isAllowed = isAllowed;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }
}