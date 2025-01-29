package assessment;


public class Competitor1 {
	private int competitorID;
	private Name name;
	private String competitionLevel;
	private String country;
	
	
	public Competitor1 (int competitorID, Name name, String competitionLevel, String country) {
		this.competitorID= competitorID;
		this.name= name;
		this.competitionLevel= competitionLevel;
		this.country= country;
	}
	
	
	public int getCompetitorID() {
		return competitorID;
	}
	public void setCompetitorID(int competitorID) {
		this.competitorID=competitorID;
	}
	
	
	public Name getNAme() {
		return name;
	}
	public void setname(Name name) {
		this.name=name;
	}
	
	
	public String getcompititionLevel() {
		return competitionLevel;
	}
	public void setcompetitionLevel(String competitionLevel) {
		this.competitionLevel=competitionLevel;
	}
	
	
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		this.country=country;
	}
	

	public double getOverallScore() {
		return 5;// placeholder value
	}
	
	
	//this method get details of competitor
	public String getFullDetails() {
		return "Competitor numeber"+ competitorID + ", name"+name.getfullName()+", country"+ name.getfirstName()+"is a "+competitionLevel + "and has an overall score of "+getOverallScore()+".";
	}
	
	
	public String getShortDetails() {
		return "CN" + competitorID +"("+name.getInitials()+ ") has overall score "+ getOverallScore()+".";
	}
	public static void main(String[]args) {
		Name name1 =new Name("John","Snow");
		Name name2 =new Name("Anupam","Poudel");
		Name name3 =new Name("Lewis","Hamilton");
		Name name4 =new Name("Max","Verstappen");
		
		Competitor1 competitor1= new Competitor1 (1,name1,"Advanced","USA");
		Competitor1 competitor2= new Competitor1 (2,name2,"Beginner","Nepal");
		Competitor1 competitor3= new Competitor1 (3,name3,"Advanced","UK");
		Competitor1 competitor4= new Competitor1 (4,name4,"Advanced","Dutch");
		
		
		System.out.println(competitor1.getFullDetails());
		System.out.println(competitor2.getFullDetails());
		System.out.println(competitor3.getFullDetails());
		System.out.println(competitor4.getFullDetails());
	}
}



class Name{
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public String getfullName() {
		return firstName+" "+ lastName;
	}
	public String getInitials() {
		return firstName.charAt(0)+" "+ lastName.charAt(0);
	}
}
