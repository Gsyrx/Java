package prog7;

public class Person {
    String name;
    String edu;
    Salary salary;
    float yearOfExp;
    int noOfLoans;
    float loanAmount;

    Person(String name,String edu,float yearOfExp){
        this.name = name;
        this.edu = edu;
        this.yearOfExp = yearOfExp;
    }

    void setLoan(int noOfLoans,float loanAmount){
        this.noOfLoans = noOfLoans;
        this.loanAmount = loanAmount;
    }

    void setSalary(Salary salary){
        this.salary = salary;
    }

    boolean isEligible(){
        if(yearOfExp>5 && loanAmount < 15000)
            return true;
        else 
        	return false;
    }

    boolean isEligiblePromotion(){
        if (yearOfExp > 10) 
        	return  true;
        else 
        	return false;
    }

    @Override
    public String toString() {
        return 
                "\nName=" + name + '\n'+
                "Edu= " + edu + '\n' +
                "Net Salary=" + salary.netSalary +'\n'+
                "YearOfExp=" + yearOfExp +'\n';
    }
}

class Salary{
    float basic;
    float daPer;
    float hraPer;
    float grossSal;
    float netSalary;

    float tax(float amount){
        float salPerYear = amount * 12;
        float taxAmount = 0;
        if(salPerYear < 500000)
            taxAmount = 25000;
        else if(salPerYear < 1000000)
            taxAmount = 30000;
        else taxAmount = 50000;

        return taxAmount;
    }
    Salary(float basic,float daPer,float hraPer){
        this.basic = basic;
        this.daPer = daPer;
        this.hraPer = hraPer;


        grossSal = this.basic + this.basic*this.daPer/100+this.basic*this.hraPer/100;
        float taxPerMonth = tax(grossSal)/12;
        netSalary = grossSal - taxPerMonth;

    }
}










package prog7;

public class DemoPerson {
    public static void main(String[] args) {
        Person person = new Person("Abhijit","M.Tech",15);
        person.setSalary(new Salary(40000,125,30));
        person.setLoan(1,10000);
        System.out.println("Person details are as :");
        System.out.println(person);
        System.out.println("No of loans = "+ person.noOfLoans+"\n"+"Loan amount = "+person.loanAmount);
        System.out.println("Gross salery = "+person.salary.grossSal);
        System.out.println("Tax paid = "+person.salary.tax(person.salary.grossSal)/12);
        System.out.println("Eligiblity for loan : ? "+person.isEligible());
        System.out.println("Eligiblity for promotion : ?"+person.isEligiblePromotion());
    }
}
