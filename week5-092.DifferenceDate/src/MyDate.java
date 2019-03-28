public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    private int inDays(){
        return year*360 + month*30 + day;
    }

    private int inDays(MyDate date){
        return date.year*360 + date.month*30 + date.day;
    }

    public int differenceInYears(MyDate compareDate){
        int did = Math.abs(inDays() - inDays(compareDate));
        return did/360;
    }


}
