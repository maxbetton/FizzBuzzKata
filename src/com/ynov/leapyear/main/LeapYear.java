public class LeapYear {

    public boolean isLeapYear(int year) {
        if(year%400 == 0)
            return true;
        else if(year%100 == 1 && year%4 == 0)
            return true;
        else
            return false;
    }
}
