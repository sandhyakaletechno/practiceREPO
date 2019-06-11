package basic;
// " GoodMorningTechnocreditsTechnoTechnocredits"find how many times technocredits
public class String1 {

	public static void main(String[] args) {
		
		String input="GoodMorningTechnocreditsTechnoTechnocredits";
		String input1=input.replaceAll("Technocredits","*");
		System.out.println(input1);
		int cnt=0;
		for(int i=0;i<=43;i++){
			for(int j=0;j<=43;j++){
				if(input1.charAt(i)=='*'){
					cnt++;
				}
			System.out.println(cnt);
		}
		}
		
	}
		
		}


