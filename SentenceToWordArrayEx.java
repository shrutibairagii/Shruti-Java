import java.util.*;
class SentenceToWordArrayEx
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String sen =sc.nextLine();

		int cnt=1;
		int i=0;
		//infinite loop becoz we dont know the no of words
		for (; ; ) 
		{
			String word=" ";
			for (;i<sen.length() ;i++ ) 
			{
				char ch = sen.charAt(i);
				if (ch==' ') 
				{
					//update the index for next word
					i=i+1;
					//increase the count after getting a word
					cnt++;
					break;				
				}		
				word+=ch;	
			}		
			//to terminate the infinte loop at last index of sentance
			if (i==sen.length()) 
			{
				break;	
			}
			String []words = stringToStringArray(cnt,sen);
			System.out.println(Arrays.toString(words));
		}	
		
	}
	public static String[] stringToStringArray(int cnt , String sen)
		{
			String[]words=new String[cnt];
			int indx=0;
			int i=0;
			//infinite loop becoz we dont know the no of words
			for (; ; ) 
			{
				String word=" ";
				for (;i<sen.length() ;i++ ) 
				{
					char ch=sen.charAt(i);
					if (ch==' ') 
					{
						//update the index for next word
						i=i+1;
						//increase the count after getting a word
						cnt++;
						break;			
					}	
					word +=ch;	
				}	
				words[indx++]=word;
				//to terminate the infinte loop at last index of sentance
				if (i==sen.length()) 
						break;	
				
						return words;
			}
		}
	}
