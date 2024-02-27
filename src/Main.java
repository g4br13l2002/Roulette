public class Main{
    public static void main(String[] holi){
	String[] obj = {"1","2","3","4","5","6","7","8"};	
	String[] names = {"Gabriel","Juanpi","Daniel","Antonio"};
	
	//primer parámetro (número de integrantes)
	Roulette roulette = new Roulette(names.length,obj,names);
	roulette.repartir();
    }
}
