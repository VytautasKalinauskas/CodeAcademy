
public class MotorineTransportoPriemone extends TransportoPriemone {
	
	Double variklioTuris;
	
	public MotorineTransportoPriemone(String pavadinimasParam, Integer pagaminimoMetaiParam, Double variklioTurisParam) {
		
		super(pavadinimasParam, pagaminimoMetaiParam);
		variklioTuris = variklioTurisParam;
		
	}

	public Double getVariklioTuris() {
		return variklioTuris;
	}

	public void setVariklioTuris(Double variklioTuris) {
		this.variklioTuris = variklioTuris;
	}
	
	@Override
	protected void spausdink() {
		super.spausdink();
		System.out.println("Motorine Transporto Priemone");
	}
	
	
	
	

}
