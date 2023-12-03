package kadai_017;

abstract public class Kato_Chapter17 {
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	public void commonIntroduce(String familyName, String address){
		this.familyName = familyName;
		this.address = address;
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		System.out.println("私の名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		eachIntroduce();
		System.out.println("");
	}
	
}
