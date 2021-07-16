package NeuralNetwork;

public class ReLUNeuron extends WeightedNeuron {

	protected double threshold = 0;
	
	public ReLUNeuron(double bias) {
		super(bias);
	}
	
	/**
	 * A Rectified Linear Unit activation function
	 * @param value of normalized inputs.
	 * @return the value after being run through a ReLU activation function.
	 */
	protected Double activationFunc(Double value) {
		return Math.max(threshold, value);
	}
	
	/**
	 * Getter for the threshold used in the ReLU activation function.
	 * @return the threshold used in the ReLU activation function.
	 */
	public double getThreshold() {
		return threshold;
	}
	
	/**
	 * Setter for the threshold used in the ReLU activation function.
	 * @param threshold value to be used in the ReLU activation function.
	 */
	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}
}
