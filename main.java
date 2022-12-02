// Marvish Chandra

public class dashboardMetrics{
    public static void employeeLeads(String[] args clients){
        if clients > 5:
        System.out.println("Assume that this is a new employee, encourage them to find new clients or give them prospective clients to work with.");
        if clients < 10:
        System.out.println("The employee has a variety of clients, but encourage them to find new leads or persuade their current clients to purchase more of your products.");
    }
    public static void openActivities(String[] args calls,demos,visits){
        if calls < 5:
        System.out.println("The employee must be making numerous calls per day to increase sales for the company and to fulfill their personal quotas.");
        if demos == true:
        System.out.println("Inform the employee to make a demonstration of how the product works either by video or audio chat.");
        if demos == false:
        System.out.println("The employee does not need to teach the customer how the product works. The employee must convince their clients to purchase products.");
        if visits == true:
        System.out.println("Inform the employee that they need to make a client visit.");
        if visits == false:
        System.out.println("Ensure that the employee remains in the office to make their sales and reach their necessary quotas.");
    }
    public static void openCases(String[] args){}
    public static void overdueCases(String[] args ){}
    public static void closedOpportunities(String[] args ){}
    public static void caseLength(String[] args days){
        if days > 5:
        System.out.println("The case is relatively new, so ensure that the employee looks at the case immediately to solve the problem.");
        if days < 30:
        System.out.println("The case is past overdue. Inform the employee that they need to look at the case immediately before your company loses business.");
    }
    public static void caseQuota(String[] args completedCases){
        if completedCases < 5:
        System.out.println("The number of cases that your employee has completed is too small. Help them find new leads or tell them to pursue more of their current leads.");
        if completedCases > 15:
        System.out.println("The employee is successful with completing their cases on time. Make sure the employee has enough future clients to continue and that they are successful in leads.");
    }
    public static void successRate(String[] args){}
    
}