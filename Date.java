public class Date {

    //ATTRIBUTES
    private int day;
    private int month;
    private int year;

    //CONSTRUCTORS
    public Date() {}

    //SETTERS
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //GETTERS
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFullDate() {
        String temp1 = String.valueOf(day), temp2 = "", temp3 = String.valueOf(year);

        switch (month) {
            case 1:
                temp2 = "January";
                break;

            case 2:
                temp2 = "February";
                break;

            case 3:
                temp2 = "March";
                break;

            case 4:
                temp2 = "April";
                break;

            case 5:
                temp2 = "May";
                break;

            case 6:
                temp2 = "June";
                break;

            case 7:
                temp2 = "July";
                break;

            case 8:
                temp2 = "August";
                break;

            case 9:
                temp2 = "September";
                break;

            case 10:
                temp2 = "October";
                break;

            case 11:
                temp2 = "November";
                break;

            case 12:
                temp2 = "December";
                break;

            default:
                break;
        }

        return temp1.concat(" " + temp2 + " " + temp3);
    }
}
