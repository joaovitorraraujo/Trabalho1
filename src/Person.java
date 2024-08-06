public class Person {
    //attributes
    String name;
    int age;
    String gender;
    float height;
    float weight;
    boolean open;

    //metodos
    void status(){
        System.out.println(name+" tem "+age+" anos, é do gênero "+gender+" ,pesa "+weight+"kg e tem "+height+"cm de altura!");
    }

    void walk(int steps){
        for (int i = 1;i<=steps;i++) {
            System.out.println(name + " deu " + i + " passos");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Reinterrompe a thread
                System.out.println("O método walk foi interrompido");
                break;
            }
            }
        }

    void openFridge(){
        this.open = true;
    }

    void closeFridge(){
        this.open = false;
    }

    void eat(String food){
        if(open){
            System.out.println("A geladeira está aberta, "+name+" comeu um "+food+"!\n\n\n");
        }
        else {
            System.out.println("Abra a geladeira para pegar a comida!");
        }
    }
}
