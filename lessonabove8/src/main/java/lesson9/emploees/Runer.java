package lesson9.emploees;



public class Runer {
    public static void main(String[] args) {

        Bilder bilder = new Bilder();
        Developer developer = new Developer();
        Tester tester = new Tester();
        Employe[] employes = new Employe[3];

        employes[0]=bilder;
        employes[1]=tester;
        employes[2]=developer;

        for (Employe employe: employes) {

            employe.work();
        }

        LazyEmployee lazyEmployee = new LazyEmployee() {
            @Override
            void work() {
              System.out.println("work");

            }
        };

         lazyEmployee.work();

       }
      }


