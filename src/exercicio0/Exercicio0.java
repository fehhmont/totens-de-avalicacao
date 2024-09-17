/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio0;


public class Exercicio0 {

    
    public static void main(String[] args) {
        
        int pesq[] = new int[150];
        
        int totalRuim=0, totalReg=0, totalExc=0;
        double porcRuim=0, porcReg=0, porcExc=0;
        
        for (int i = 0; i < pesq.length; i++) {
            
            pesq[i]= (int) (Math.random()*3)+1;
            
        }
        for (int i = 0; i < pesq.length; i++) {
            
            switch(pesq[i]){
                case 1:
                    totalRuim++;
                    break;
                    
                case 2:
                    totalReg++;
                    break;
                    
                case 3:
                    totalExc++;
                    break;
            }
            
        }
        porcRuim = (totalRuim/150.)*100;
        porcReg = (totalReg/150.)*100;
        porcExc = (totalExc/150.)*100;
        
        
        
        System.out.println("Ruim....."+totalRuim + "---" + porcRuim+"%");
        System.out.println("Regular.."+totalReg + "---" + porcReg+"%");
        System.out.println("Excelente"+totalExc + "---" + porcExc+"%");
         
    }
    
}
