package neuralNetwork;

public class DataSet {
	private double[]inputValues;
	private double[]desiredOutputs;
	
	public DataSet(double[] inputValues, double[] desiredOutputs) {
		this.inputValues = inputValues;
		this.desiredOutputs = desiredOutputs;
	}
	public double[] getDesiredOutputs() {
		return desiredOutputs;
	}
	public void setDesiredOutputs(double[] desiredOutputs) {
		this.desiredOutputs = desiredOutputs;
	}
	public double[] getInputValues() {
		return inputValues;
	}
	public void setInputValues(double[] inputValues) {
		this.inputValues = inputValues;
	}
}
