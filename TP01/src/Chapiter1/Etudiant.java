package Chapiter1;

public class Etudiant {
private String lnameE;
private String fnameE;
private String numE;
private String braE;
private int ageE;
private final String blood = "B+";
public Etudiant(String lnameE , String fnameE , String numE , String braE , int ageE){
    this.lnameE = lnameE;
    this.fnameE = fnameE;
    this.numE = numE;
    this.braE = braE;
    this.ageE = ageE;
}
public void setLnameE(String lnameE){
    this.lnameE = lnameE;
}
public void setFnameE (String fnameE){
    this.fnameE = fnameE;
}
public void setNumE (String numE){
    this.numE = numE;
}
public void setBraE (String braE){
    this.braE = braE;
}
public void setAgeE (int ageE){
    this.ageE = ageE;
}
public String getLnameE(){
    return this.lnameE;
}
public String getFnameE(){
    return this.fnameE;
}
public String getNumE(){
    return this.numE;
}
public String getBraE(){
    return this.braE;
}
public int getAgeE(){
    return this.ageE;
}
public String getBlood(){
    return this.blood;
}
public void disp(){
    System.out.println("- Last name : "+lnameE +"\n- First name: "+ fnameE +"\n- Number: "+ numE + "\n- Branche: " +braE+ "\n- Age: "+ageE +"\n- Blood: "+ blood);

}
}
