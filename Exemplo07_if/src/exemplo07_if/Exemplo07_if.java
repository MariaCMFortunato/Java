/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo07_if;

/**
 *
 * @author Maria11
 */
public class Exemplo07_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 10;
       int b = 3;
       
        if(a < b){
            System.out.println("a menor que b");
        }
        else
            System.out.println("a maior ou igual a b");
        //--------------------------------------------------
        if((a > 9) && (b > 2 ))
            System.out.println("a mior que 9 e b maior que 2");
        
        //--------------------------------------------------
        if((a < 9)|| (b > 2 ))
            System.out.println("a mior que 9 ou maior que 2");
        
        //--------------------------------------------------
        if(a == 1)
            System.out.println("a igual a 1");
        else if(a == 2)
            System.out.println("a igual a 1");
        else
            System.out.println("a diferente de 1 e 2");
        
        if(1<0)
            System.out.println("1 é maior que 0");
         else if(1>0)
            System.out.println("1 é maior que 0");
         
        if(true)
            System.out.println("course it is true");
        
        boolean ganheiOEuromilhoes = (1<0);
        boolean casarComAlguemRico= (1>0);
        
        if(ganheiOEuromilhoes || casarComAlguemRico)
            System.out.println("fico rico");
    }
    
}
