
public class OroTransportoPriemone extends MotorineTransportoPriemone{
	
	Integer varikliuSkaicius;
	
	public OroTransportoPriemone(String pavadinimasParam, Integer pagaminimoMetaiParam, Double variklioTuris, Integer varikliuSkaiciusParam) {
		
		super(pavadinimasParam, pagaminimoMetaiParam, variklioTuris);
		varikliuSkaicius = varikliuSkaiciusParam;
		
	}

	public Integer getVarikliuSkaicius() {
		return varikliuSkaicius;
	}

	public void setVarikliuSkaicius(Integer varikliuSkaicius) {
		this.varikliuSkaicius = varikliuSkaicius;
	}
	
	
	

}
