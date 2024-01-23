package casting;
public class InternationalStudent extends Student{
    
    private String Country;

    
    public InternationalStudent(){
        
        
    }
        public InternationalStudent(String name, String address, String school, double score, String Country) {
     super(name, address, school,  score);
        this.Country = Country;
         this.Country = Country;
    }
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
    

    
}
