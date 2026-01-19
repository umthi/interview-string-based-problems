package epam;

sealed class InsuranceClaim permits MedicalClaim, DentalClaim {
    public String processClaim(){
        return "insurance claim processed ";
    };
}

//final/sealed/non-sealed classes can extends sealed classes
// this class permits only ReimbursementClaim class
sealed class MedicalClaim extends InsuranceClaim permits ReimbursementClaim {
    public String processClaim(){
        return "medical insurance claim processed";
    };
}

//this class permits any classes to extend
non-sealed class ReimbursementClaim extends MedicalClaim {
    public String processClaim(){
        return "Reimbursement medical insurance claim processed";
    };
}

// no classes can inherit this class
final class DentalClaim extends InsuranceClaim {
    public String processClaim(){
        return "dental insurance claim processed";
    };
}

//other than medical and dental claim not permitted to extends insuranceclaim class
//final class emergencyClaim extends InsuranceClaim {}

public class SealedClassExample {
    public static void main(String[] args) {
        MedicalClaim mc = new MedicalClaim();
        System.out.println(mc.processClaim());
        DentalClaim dc = new DentalClaim();
        System.out.println(dc.processClaim());
        ReimbursementClaim rc = new ReimbursementClaim();
        System.out.println(rc.processClaim());
    }
}
