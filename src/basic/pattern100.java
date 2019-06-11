package basic;

public class pattern100 {

	public static void main(String[] args) {

for(int i=1;i<=9;i++)
{
	for(int j=8;j>=i;j--)
	{
		System.out.print(" ");
	}

for(int k=1;k<=i;k++){
	System.out.print(k);
}
for(int l=2;l<=i;l++){
	int cnt=1;
	for(int y=1;y<=i;y++){
		System.out.print(cnt);
	cnt++;
	}
}
System.out.println();
}

	}

}
