package sunny.learn;

public class Constructor {
	int n1,n2;
	//Constructor(){
		
	//}
	Constructor(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	public void showvalues() {
		System.out.println("n1 is "+ n1 + "\nn2 is "+ n2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cdemo=new Constructor(10,20);
		cdemo.showvalues();
		}
	//www.linkedin.com/in/inturi-chaitanya-sai-135093275
}
