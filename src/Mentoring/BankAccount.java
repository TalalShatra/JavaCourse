package Mentoring;


        //Create a class called BankAccount
        //Create an instance variable called balance and savings after that
        //create a couple more variables like gas, electricity, rent, shopping, fun etc.
        //Continue from the remaining task
        //Add 2 constructor items: salary and savings and set these values
        // and add the salary to your current balance
        //Create a class called user, the constructor of this class should have a username, password and email
        //This class should have userID which will be generated randomly when the object is created
        //For second task create a method called check validity and if the email doesn't contain the character "@"
        //Print "your credentials seems to be incorrect please create another user"
        //Also create a method to print out all the information of the user:
        //"Username: technoStudy, Password: confidential123, userID: 762386127"
class BankAccount {

            public BankAccount(int salary, int savings) {
                this.balance += salary;
                this.savings = savings;
            }

            int balance, savings;

            int electricity, fun, rent, shopping, gas;

            public void calculateRemainingBalance() {
                balance = balance - (electricity + fun + rent + shopping + gas);

                System.out.println("You remaining balance is: " + balance + " and it has been transferred to your savings account.");

                savings = savings + balance;

                balance = 0;

            }

            public static void main(String[] args) {

                BankAccount checking = new BankAccount(10000, 25000);

                checking.balance = 7000;

                checking.fun = 500;
                checking.gas = 150;
                checking.rent = 2500;
                checking.electricity = 100;
                checking.shopping = 1500;

                checking.calculateRemainingBalance();

                System.out.println(checking.savings);

            }

            class User {
                int userID;

                String username, password, email;

                public User(String username, String password, String email) {

                    if (email.contains("@"))
                        this.email = email;
                    else
                        System.out.println("your credentials seems to be incorrect please create another user");

                    this.username = username;
                    this.password = password;
                    this.userID = (int) (Math.random() * 10000);
                }

                public void printInfo() {
                    System.out.println("Username: " + this.username + "Password: " + this.password +
                            "User ID: " + this.userID);
                }

                public void main(String[] args) {
                    User user1 = new User("technoStudy", "confidential123", "technostudy@info");
                    user1.printInfo();
                }
            }
        }



