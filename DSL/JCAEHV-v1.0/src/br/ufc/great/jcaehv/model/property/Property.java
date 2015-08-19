package br.ufc.great.jcaehv.model.property;

public class Property {

	private PropertyType type;

	private String exceptionName;

	private String formula;

	private boolean isAccepted;
	
	private String name; //TODO: Added name field

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Property(PropertyType type) {
		this.type = type;
	}

	public PropertyType getType() {
		return type;
	}

	public boolean isAccepted() {
		return isAccepted;
	}

	public void setAccepted(boolean isAcepted) {
		this.isAccepted = isAcepted;
	}

	public String getExceptionName() {
		return exceptionName;
	}

	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		buffer.append((this.isAccepted) ? ("Accepted") : ("Rejected"));
		buffer.append("]");
		buffer.append("[");
		
		if(this.name != null){
			buffer.append(this.name);
		} else {
			buffer.append(this.exceptionName);
		}
		
		buffer.append("]");
		
		if(this.name == null){
			buffer.append("(");
		}
		switch (this.type) {
		case DETECTION_LIVENESS:
			buffer.append("Detection Liveness");
			break;
		case CATCH_LIVENESS:
			buffer.append("Catch Liveness");
			break;
		case HANDLER_LIVENESS:
			buffer.append("Handler Liveness");
			break;
		case HANDLING_STABILITY:
			buffer.append("Handling Stability");
			break;
		case REACHABILITY:
			buffer.append("Reachability");
			break;	
		default:
			break;
		}
		if (!this.isAccepted) {
			if(this.name == null){
				buffer.append(" : ");
			}
			switch (this.type) {
			case DETECTION_LIVENESS:
				buffer.append("Dead Exception Fault");
				break;
			case CATCH_LIVENESS:
				buffer.append("Null Handling Fault");
				break;
			case HANDLER_LIVENESS:
				buffer.append("Dead Handler Fault");
				break;
			case HANDLING_STABILITY:
				buffer.append("Cyclic Handling Fault");
				break;
			case REACHABILITY:
				buffer.append("Resume Impossible Fault");
				break;
			default:
				break;
			}
		}
		if(this.name == null){
			buffer.append(")");
		}
		buffer.append("\n\tProperty Formula: ");
		buffer.append(this.getFormula());
		return buffer.toString();
	}
}
