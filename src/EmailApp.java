import java.util.Scanner;

public class EmailApp {
    String firstName;
    String lastName;
    String department;
    final String company="MMSInd";
    private String password;
    private  int defaultPasswordLength=4;
    private final int mailBoxCapacity=200;


    EmailApp()
    {
        this.firstName=inputFirstName();
        this.lastName=inputLastName();
        this.department=setDepartment();
        this.emailId();
        this.password=generatePassword(defaultPasswordLength);
        this.printPassword();
        this.setNewPassword();
        this.displayMailBoxCapacity();
    }

    //method to input first name
    private String inputFirstName()
    {
        System.out.println("Enter your First Name:\t ");
        Scanner scanner= new Scanner(System.in);
        firstName=scanner.next();
        return firstName.toLowerCase();
    }

    //method to input last name
    private String inputLastName()
    {
        System.out.println("Enter your Last Name:\t ");
        Scanner scanner= new Scanner(System.in);
        lastName=scanner.next();
        return lastName.toLowerCase();
    }

    //method to set department
    private String setDepartment()
    {
        System.out.println("Enter your Department code:\t 1-Sales\t 2-Development\t 3-Accounting");
        Scanner scanner=new Scanner(System.in);
        int departmentCode= scanner.nextInt();
        if(departmentCode==1)
        {
            return "sales";
        }
        if(departmentCode==2)
        {
            return "development";
        }
        if(departmentCode==3)
        {
           return "accounting";
        }
        else
        {
            return "Invalid";
        }

    }

    //method to create email id
    private void emailId()
    {
        System.out.println(firstName+"."+lastName+"@"+department+"."+company+".com");
        //mailId=firstName+"."+lastName+"@"+department+"."+company+".com";
    }

    //method to generate random password
    private String generatePassword(int length)
    {
        String setPassword="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char randPassword[]=new char[length];
        for(int i=0; i<length; i++)
        {
            int rand= (int)(Math.random()*setPassword.length());
            randPassword[i]=setPassword.charAt(rand);
        }
        return new String(randPassword);
    }

    //print password
    private void printPassword()
    {
        System.out.println("Your password is "+password);
    }

    //method to change password
    private void changePassword(String newPassword)
    {
        password=newPassword;
    }

    //method to enter new password
    public void setNewPassword()
    {
        System.out.println("Enter new password: ");
        Scanner scanner=new Scanner(System.in);
        changePassword(scanner.next());
        System.out.println("Your password is changed successfully");
        printPassword();
    }

    //set mailbox capacity
    private void displayMailBoxCapacity()
    {
        System.out.println("Your Mail box capacity is "+mailBoxCapacity+"gb");
    }

    private void finalDisplay()
    {
        System.out.println("");
    }

}
