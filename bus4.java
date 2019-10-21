/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2;

/**
 *
 * @author asus
 */
public class bus4 {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbaru;
    
    public bus4(double maxpenumpang){
    this.maxpenumpang = maxpenumpang;
    penumpang = 0;
}
    public void addpenumpang(double penumpang){
    double temp;
    temp =this.penumpang + penumpang;
    if (temp > maxpenumpang){
            System.out.println("Kakean Lur");    
    } else {
        this.penumpang = temp;
    }
    counter++;
    penumpangbaru += penumpang;
    
}
    public void getpenumpang (int password){
        if (password == 2003){
            System.out.println("Password nye bener gayn");
        }else{
            System.out.println("Punten slurr PW nya salah"); 
       }
    }
    
    public double getaverage(){
        double a = 0.0;
        a = penumpang / counter;
        return a;
    }
    public void cetakpenumpang(){
        System.out.println("Berat penumpang bus sekarang : " + penumpang );
        System.out.println("berat penumpang seharusnya ; " +maxpenumpang);
        System.out.println("Rata Rata berat : " + getaverage());
    }
}
