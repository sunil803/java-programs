class BMS extends Thread{
	
	public void run(){
		while(true){
			try{
				System.out.println("BMS College of Engineering");
				sleep(10000);
			}
			catch(InterruptedException e){}
		}
	}
}

class CSE extends Thread{
	public void run(){
		while(true){
			try{
				System.out.println("CSE");
				sleep(2000);
			}
			catch(InterruptedException e){}
		}
	}
}


class MThread{
	public static void main(String args[]){
		new BMS().start();
		new CSE().start();
	}
}