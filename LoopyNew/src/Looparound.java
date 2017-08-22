public class Looparound {

			static boolean breaker ;
			
			public void setBreaker(boolean val) {
				breaker = val;
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Tryagain ti = new Tryagain();
				Program pl = new Program();

				while(breaker == false) {
					
					pl.programLogic();
					ti.tryIt();
					
					}
			}
}
