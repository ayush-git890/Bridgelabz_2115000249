import java.util.*;
import java.text.*;

class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }
    public String getPolicyholderName() {
        return policyholderName;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public String getCoverageType() {
        return coverageType;
    }
    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy that = (InsurancePolicy) obj;
        return policyNumber.equals(that.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "PolicyNumber: " + policyNumber + ", Policyholder: " + policyholderName +
                ", ExpiryDate: " + sdf.format(expiryDate) + ", Coverage: " + coverageType + ", Premium: " + premiumAmount;
    }
}

public class InsurancePolicyManagement {
    private static Set<InsurancePolicy> policyHashSet = new HashSet<>();
    private static Set<InsurancePolicy> policyLinkedHashSet = new LinkedHashSet<>();
    private static Set<InsurancePolicy> policyTreeSet = new TreeSet<>();
    public static void addPolicy(InsurancePolicy policy) {
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        policyTreeSet.add(policy);
    }
    public static InsurancePolicy getPolicyByNumber(String policyNumber) {
        for (InsurancePolicy policy : policyHashSet) {
            if (policy.getPolicyNumber().equals(policyNumber)) {
                return policy;
            }
        }
        return null;
    }
    public static List<InsurancePolicy> getPoliciesExpiringSoon() {
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (InsurancePolicy policy : policyHashSet) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }
    public static List<InsurancePolicy> getPoliciesByPolicyholder(String policyholderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyHashSet) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    public static void removeExpiredPolicies() {
        Date currentDate = new Date();
        policyHashSet.removeIf(policy -> policy.getExpiryDate().before(currentDate));
        policyLinkedHashSet.removeIf(policy -> policy.getExpiryDate().before(currentDate));
        policyTreeSet.removeIf(policy -> policy.getExpiryDate().before(currentDate));
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        addPolicy(new InsurancePolicy("1111", "rohit", sdf.parse("2025-05-10"), "Health", 200.50));
        addPolicy(new InsurancePolicy("2222", "mohit", sdf.parse("2025-02-25"), "Auto", 150.75));
        addPolicy(new InsurancePolicy("3333", "mohit", sdf.parse("2024-03-15"), "Home", 300.00));

        System.out.println("Policy 1111: " + getPolicyByNumber("1111"));

        System.out.println("Policies Expiring Soon: " + getPoliciesExpiringSoon());

        System.out.println("Policies for mohit: " + getPoliciesByPolicyholder("mohit"));

        removeExpiredPolicies();
        System.out.println("Remaining Policies after removing expired ones: ");
        policyHashSet.forEach(System.out::println);
    }
}
