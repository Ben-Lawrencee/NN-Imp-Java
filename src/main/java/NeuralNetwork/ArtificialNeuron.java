package NeuralNetwork;

public abstract class ArtificialNeuron<I, U, Y> extends Neuron {
	
	public Y value;
	
	protected double bias = 0;
	
	public ArtificialNeuron() {
		bias = Math.random() * 10;
	}
	
	public ArtificialNeuron(double bias) {
		this.bias = bias;
	}
	
	/**
	 * Normalizes, and computes the result based on given inputs.
	 * @param inputs for calculating the result.
	 * @return the result.
	 */
	public abstract Y evaluate(I... inputs);
	
	/**
	 * Normalizes the inputs, then computes the compressed value, then runs it through the activation function.
	 * @param inputs to be processed.
	 * @return normalized and computed result. Awaiting to be run through an activation function.
	 */
	protected abstract U normalize(I... inputs);
	
	/**
	 * Activation function for the normalized and computed values
	 * @param value to be parsed through the activation function.
	 * @return value after being parsed through the activation function.
	 */
	protected abstract Y activationFunc(U value);
	
	/**
	 * Getter for the bias on this neuron.
	 * @return bias for this neuron.
	 */
	public double getBias() {
		return bias;
	}
	
	/**
	 * Setter for the bias on this neuron.
	 * @param bias to be set for this neuron.
	 */
	public void setBias(double bias) {
		this.bias = bias;
	}
}
