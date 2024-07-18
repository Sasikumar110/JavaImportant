package SystemDesign;

public class BilderDesignPattern {
	private  boolean condition;
	private String found;
	private String struct;
	private String furnit;
	
	
	public boolean isCondition() {
		return condition;
	}
	public String getFound() {
		return found;
	}
	public String getStruct() {
		return struct;
	}
	public String getFurnit() {
		return furnit;
	}
	
	public BilderDesignPattern(Builder build)
	{
		this.condition =build.condition;
		this.found=build.found;
		this.struct=build.struct;
		this.furnit=build.furnit;
	}
	
	
	public static  class Builder
	{
		private  boolean condition;
		private String found;
		private String struct;
		private String furnit;
		
		public Builder(boolean condition, String found, String struct, String furnit) {
			this.condition = condition;
			this.found = found;
			this.struct = struct;

			this.furnit = furnit;
		}

		public Builder(boolean condition, String found, String struct) {
			this.condition = condition;
			this.found = found;
			this.struct = struct;
		}

		public Builder(boolean condition, String found) {
			this.condition = condition;
			this.found = found;
		}

		public Builder(boolean condition) {
			this.condition = condition;
		}
		

		public void setCondition(boolean condition) {
			this.condition = condition;
		}

		public void setFound(String found) {
			this.found = found;
		}

		public void setStruct(String struct) {
			this.struct = struct;
		}

		public void setFurnit(String furnit) {
			this.furnit = furnit;
		}

		public BilderDesignPattern build()
		{
			return new BilderDesignPattern(this);
		}
		
		
		
	
		
	}

	

}

