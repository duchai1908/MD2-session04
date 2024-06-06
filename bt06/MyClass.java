package btsession04.bt06;

public class MyClass {
    private String myString;

    public MyClass() {
        myString = "Hello World";
    }
    public MyClass(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
}
