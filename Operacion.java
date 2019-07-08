public class Operacion{
		private int n1;
		private int n2;
		private int suma;
	public Operacion(int n1, int n2, int suma){
		this.n1=n1;
		this.n2=n2;
		this.suma=suma;
}
	public void setN1 (int n1){
		n1=n1;
}	
	public int getN1 (){
		return n1;
}
	public void setN2 (int n2){
		n2=n2;
}	
	public int getN2 (){
		return n2;
}
	public void setSuma (int suma){
		suma=suma;
}	
	public int getSuma (){
		return suma;
}
	public void imprimirDatos(){
		System.out.println(getN1());
		System.out.println(getN2());
		System.out.println(getSuma());
}
}