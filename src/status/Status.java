package status;

import java.util.Scanner;

public class Status {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (ZERO, ONE,TWO, THREE)");
        String code = in.next();

        StausUser t = new StausUser();
        StausUser.UserStatus status = StausUser.UserStatus.valueOf(code.toUpperCase());
        t.statusDetail(status);
    }
}
