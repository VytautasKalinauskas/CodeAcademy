
public class Pica {
	
	PicuDydziai dydis;
	Integer suriai;
	Integer peperoni;
	
	
	public Pica(PicuDydziai dydis, Integer suriai, Integer peperoni) {
		super();
		this.dydis = dydis;
		this.suriai = suriai;
		this.peperoni = peperoni;
	}
	
	public PicuDydziai getDydis() {
		return dydis;
	}
	public void setDydis(PicuDydziai dydis) {
		this.dydis = dydis;
	}
	public Integer getSuriai() {
		return suriai;
	}
	public void setSuriai(Integer suriai) {
		this.suriai = suriai;
	}
	public Integer getPeperoni() {
		return peperoni;
	}
	public void setPeperoni(Integer peperoni) {
		this.peperoni = peperoni;
	}
	
	public Integer skaiciuotiKaina() {
		Integer kaina = 0;
		
		switch(dydis) {
			case MAZAS:
				kaina += 11;
				break;
			case VIDUTINIS:
				kaina += 12;
				break;
			case DIDELIS:
				kaina+= 14;
		}
		
		kaina += suriai	* 2;
		kaina += peperoni * 2;
		
		return kaina;
	}

}
