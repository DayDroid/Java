package SACSA;

public class SwitchExpressions {
    public static void main(String[] args) {

        String day = "sat";

        // no lambdas here unfortunately
        switch(day) { // add string day to switch to compare for equality with the list of values.
            case "Monday":
                System.out.println("Monday");
                break; // break is important because if the case is matched,  everything below will be printed as well. If there is no matching case, you can add "default:" at the end to set a default execution
            //( cont.) if none is met.
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
            break;
            default:
                System.out.println("No matching dates.");

        }
            }


        }