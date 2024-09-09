
package PBO_2_Tugas;



 public class Matematika implements InterfaceMatematika{
    int a, b;
    
    Matematika(int a, int b){
        this.a = a;
        this.b = b;
    }   

    
    @Override
    public   int pertambahan(){
        return a + b;
    }
    
    public  int pengurangan(){
        return a - b;
    }
    
    public  int perkalian(){
        return a * b;
    }
    
    public  int pembagian(){
        return a / b;
    }
    
}


