package food2door;

import java.time.LocalDate;

public class User {

    private final String user;
    protected final String userName;
    protected final String userSurname;
    protected final LocalDate dOB;
    protected final LocalAddress userAddress;
    protected final int phoneNumber;

    protected User(String user, String userName, String userSurname, LocalDate dOB, LocalAddress userAddress, int phoneNumber) {
        this.user = user;
        this.userName = userName;
        this.userSurname = userSurname;
        this.dOB = dOB;
        this.userAddress = userAddress;
        this.phoneNumber = phoneNumber;
    }

    protected String getUser() {
        return user;
    }
}
