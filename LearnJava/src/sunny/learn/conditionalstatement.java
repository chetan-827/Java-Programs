package sunny.learn;

public class conditionalstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =new int[5];
		
		arr[0]=20;
		arr[1]=16;
		arr[2]=15;
		arr[3]=24;
		arr[4]=45;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>=18) {
				System.out.println("I can vote");
			}else {
				System.out.println("I can't vote");
				
			}
		}
	}

}
