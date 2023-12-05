
public class Ana {

    public static void main(String[] args) {
       
        Sinif A= new Sinif();
        
        Sinif B=  new Sinif();
        
        Sinif C= new Sinif();
        
        Sinif D= new Sinif();
        
        A.sayi=598;
        B.sayi=9865;
        C.sayi=15263;
        D.sayi=1;
        
        
        A.next= B;
        B.next=C;
        C.next=D;
        D.next=null;
        
        Sinif temp= A;
        
        while( temp!= null){
            System.out.println(temp.sayi);
            
            temp = temp.next;
        }
        
        
    }
}
