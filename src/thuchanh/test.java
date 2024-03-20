package thuchanh;

public class test {
    public int kg;
    public String name;
    public int age;

    public test(int kg, String name, int age) {
        this.kg = kg;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "test{" +
                "kg=" + kg +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

 

    public static void main(String[] args) {
        test table = new test(50,"John",20);
        System.out.println(table.toString());
    }
}
