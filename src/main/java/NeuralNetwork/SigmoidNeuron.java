package NeuralNetwork;

public class SigmoidNeuron extends WeightedNeuron {
	
	public static double E = 2.71828;
	
	public SigmoidNeuron(double bias) {
		super(bias);
	}
	
	/**
	 * A sigmoid activation function is evaluated on the given value
	 * @param value of normalized inputs.
	 * @return value after being run through the sigmoid activation function.
	 */
	protected Double activationFunc(Double value) {
		return 1 / (1 + Math.pow(E, -value));
	}
}
