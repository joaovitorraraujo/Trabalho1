//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create instance
        Person p1 = new Person();
        p1.name = "José";
        p1.age = 30;
        p1.gender = "masculino";
        p1.height = 1.70f;
        p1.weight = 70.0f;

        Person p2 = new Person();
        p2.name = "Maria";
        p2.age = 20;
        p2.gender = "feminino";
        p2.height = 1.55f;
        p2.weight = 60.0f;


        p1.status();
        p1.walk(3);
        p1.openFridge();
        p1.eat("bolo");

        p2.status();
        p2.walk(2);
        p2.closeFridge();
        p2.eat("chocolate");

    }
}