class InvalidData extends Exception {
    public InvalidData(String msg) {
        super(msg);
    }
}

public class slip9_2 {
    public static void main(String args[]) {
        try {
            String panvalid = "ABC1234X";
            String mobilevalid = "9088776655";

            validPan(panvalid);
            validMob(mobilevalid);

            System.out.println("PAN no = " + panvalid);
            System.out.println("Mobile no = " + mobilevalid);
        } catch (InvalidData e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validPan(String pan) throws InvalidData {
        if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
            System.out.println("VALID PAN NO");
        } else {
            throw new InvalidData("Invalid PAN number");
        }
    }

    public static void validMob(String mobile) throws InvalidData {
        if (mobile.matches("[0-9]{10}")) {
            System.out.println("VALID Mobile NO");
        } else {
            throw new InvalidData("Invalid mobile number");
        }
    }
}
