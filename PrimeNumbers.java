package seconddaycrt;

public class PrimeNumbers {
	static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		if(count==2)  return true;
			
		else 
			return false;
	}

	public static void main(String[] args) {
		for(int i=100;i<=500;i++) {
			if(isPrime(i)==true) {
				System.out.print(i+" ");
			}
		}
		
		}
	}


