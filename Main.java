//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Segment segment =new Segment(10,20);
System.out.println("Segment cree: "+segment.toString());
System.out.println("longueur de segment: "+segment.longueur());
if (segment.appartient(15)){
    System.out.println("le point "+15+"appartient au segmernt");
}else{
    System.out.println("le point "+15+"n appartient pas au segmernt");
}
    }
}