/**
 * class Roulette to distribute problems among
 * classmates
 * @author - Angel Gabriel Sánchez Pavia
 * @version - 1.0 september 2023
 */
import rsrc.DoubleLinkedList;
public class Roulette{
    private DoubleLinkedList[] plyrs;
    private String[] plyrsName;
    private String[] obj;
    
    public Roulette(int numPlyrs, String[] objs, String[] names){
	plyrsName = names;
	plyrs = new DoubleLinkedList[numPlyrs];
	for(int i=0; i<numPlyrs; i++){
	    plyrs[i] = new DoubleLinkedList();
	}
	obj = objs;
    }
    
    /**
     * metodo para repartir los objetos a los diferentes
     * participantes
     */
    public void repartir(){
	twistObj();
	twistNames();
	int pIterator = 0;
	int objIterator = 0;
	//repartiendo objs entre plyrs hasta que
	//el iterador de objetos llege al fin del String array
	while(true){
	    if(pIterator==plyrs.length){
		pIterator = 0;
	    }
	    if(objIterator==obj.length){break;}
	    plyrs[pIterator].add(0,obj[objIterator]);
	    pIterator++;
	    objIterator++;
	}
	//mostrando el resultado
	String name = "";
	int lSize = 0;
	String pObj = "";
	for(int i=0; i<plyrs.length; i++){
	    name = plyrsName[i];
	    lSize = plyrs[i].size();
	    System.out.print(""+name+": ");
	    for(int j=0; j<lSize; j++){
		pObj =(String) plyrs[i].get(j);
		System.out.print(pObj+", ");
	    }
	    System.out.println();
	}
    }

    /**
     * metodo para revolver los objetos a repartir     
     */
    public void twistObj(){
	int pos = 0;
	for(int i=0; i<obj.length; i++){
	    String piv = obj[i];
	    pos =(int)Math.floor(Math.random()*obj.length);
	    obj[i] = obj[pos];
	    obj[pos] = piv;
	} 
    }

    public void twistNames(){
	int pos = 0;
	for(int i=0; i<plyrsName.length; i++){
	    String piv = plyrsName[i];
	    pos =(int)Math.floor(Math.random()*plyrsName.length);
	    plyrsName[i] = plyrsName[pos];
	    plyrsName[pos] = piv;
	} 
    }
}
