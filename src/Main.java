public class Main{
    public static void main(String[] holi){
	String[] obj = {"1","1","1","2","2","2"};	
	String[] names = {"Gabriel","Gaby","Serg","Did","Woo","Wonder"};
	
	//primer parámetro (número de integrantes)
	Roulette roulette = new Roulette(names.length,obj,names);
	roulette.repartir();
    }
}
