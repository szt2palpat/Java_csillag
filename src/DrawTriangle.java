import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
      char csillag='*';
      int szam=0;
      String s="";
        Scanner n=new Scanner(System.in);
        System.out.println("Addj meg egy számot:");
        szam=n.nextInt();
        if(szam>0&& szam<2){
            System.out.println("Ez nem háromszö hanem csak egy csillag:"+csillag);
        }else{

            for (int i =0;i<szam;i++){
                System.out.println(s+=csillag);
            }
        }
    }
}