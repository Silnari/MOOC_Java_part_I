public class Book {
    private String _title;
    private String _publisher;
    private int _year;

    public Book(String title, String publisher, int year){
        _publisher = publisher;
        _title = title;
        _year = year;
    }

    public int year() {
        return _year;
    }

    public String title() {
        return _title;
    }

    public String publisher() {
        return _publisher;
    }

    @Override
    public String toString() {
        return _title + ", " + _publisher + ", " + _year;
    }
}
