package homeWork_1;

public class MiniProjeSayiBulma {
    public static void main(String[] args) {
       
     int[] sayilar= new int[]{1,2,5,7,9,0};
     int aranacak=5;
     
     for (int i : sayilar) {
        if(i== aranacak){
            System.out.println(" Aranan sayı dizi içerisinde mevcut :"+ aranacak);
        }else{
            System.out.println(" Aranan sayı dizi içersinde mevcut değil :"+aranacak);
            break;
        }
     }
     


    }
}
