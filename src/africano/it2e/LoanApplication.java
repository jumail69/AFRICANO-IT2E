
package africano.it2e;


public class LoanApplication {
    
    {
    int id;
    String name;
    double monthlyIncome;
    int creditScore;
    double existingLoans;

    public LoanApplication(int id, String name, double monthlyIncome, int creditScore, double existingLoans) {
        this.id = id;
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
        this.existingLoans = existingLoans;
    }

    public boolean isApproved() {
        int creditScore;
   
        return creditScore >= 700;
    }
}
    
      
    
}


