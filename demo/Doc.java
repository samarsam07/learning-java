package demo;

public class Doc {
    private  String name;
    private  String read;
    public Doc() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public void printDetails() {
        System.out.println("Doc{" +
                "name='" + name + '\'' +
                ", read='" + read + '\'' +
                '}');
    }
}
