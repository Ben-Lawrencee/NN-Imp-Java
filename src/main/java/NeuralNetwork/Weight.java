package NeuralNetwork;

public class Weight {
	
	public double weight;
	public double result;
	
	/**
	 * Constructor for a basic weight with no preset result.
	 * @param weight to be applied to neuron's result.
	 */
	public Weight(double weight) {
		this.weight = weight;
		this.result = 0;
	}
	
	/**
	 * Constructor for a basic weight with a preset result.
	 * @param weight to be applied to neuron's result.
	 * @param result of the neuron this weight is connected to.
	 */
	public Weight(double weight, double result) {
		this.weight = weight;
		this.result = result;
	}
}
