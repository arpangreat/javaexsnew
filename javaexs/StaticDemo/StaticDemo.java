class Emp{
    int eid;
    int salary;
    String ceo;

    public void show(){
     System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class StaticDemo{
    public static void main(String[] args){

     Emp swastik = new Emp();
      swastik.eid = 8;
      swastik.salary = 1200000;
      swastik.ceo = "Tim Cook";

     Emp arpan = new Emp();
      arpan.eid = 1;
      arpan.salary = 100;
      arpan.ceo = "Swastik Acharyya";

     swastik.show();
     arpan.show();
  }
}
