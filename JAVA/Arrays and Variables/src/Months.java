public class Months {
    public enum Month { JAN, FEB, MAR, APR, MAY, JUN,
        JUL, AUG, SEP, OCT, NOV, DEC };
    public static void printCurrentMonth(Month currentMonth) {
        System.out.print("Current month is: ");
        switch (currentMonth) {
            case JAN: System.out.println("January"); break;
            case FEB: System.out.println("February"); break;
            case MAR: System.out.println("March"); break;
            case APR: System.out.println("April"); break;
            case MAY: System.out.println("May"); break;
            case JUN: System.out.println("June"); break;
            case JUL: System.out.println("July"); break;
            case AUG: System.out.println("August"); break;
            case SEP: System.out.println("September"); break;
            case OCT: System.out.println("October"); break;
            case NOV: System.out.println("November"); break;
            case DEC: System.out.println("December"); break;
            default: System.out.println("Error!");
        }
    }
    public static void main(String[] args) {
        Month currentMonth = Month.SEP;
        printCurrentMonth(currentMonth);
    }
}
