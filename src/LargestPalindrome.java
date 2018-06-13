
public class LargestPalindrome
{
	public static void main(String[] args){
		
		for(int i=998001;i>=10000;i--)
		{
			if(!isPrime(i))
			{
				String temp = String.valueOf(i);
				StringBuilder s = new StringBuilder(temp); 
				String change = s.reverse().toString();
				if(change.equals(temp))
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
	static boolean isPrime(int n)
	{
		if (n == 2)
			return true;
		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
