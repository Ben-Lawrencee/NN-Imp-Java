package NeuralNetwork;

public abstract class WeightedNeuron extends ArtificialNeuron<Weight, Double, Double> {
	
	protected Weight[] prev;
	protected Weight[] next;
	
	public WeightedNeuron(double bias) {
		super(bias);
	}
	
	/**
	 * Child evaluate function, calls parent evaluate function with preset input weights.
	 * @return the final evaluated result
	 * @throws IllegalStateException if {@code prev} is, not preset / null.
	 */
	public Double evaluate() throws IllegalStateException {
		if (prev == null)
			throw new IllegalStateException("Must preset the previous weights");
		return evaluate(prev);
	}
	
	/**
	 * Parent evaluate function. Calculates the final result for given weights.
	 * @param weights to be processed.
	 * @return the final result.
	 */
	public Double evaluate(Weight ...weights) {
		double result = activationFunc(normalize(weights));
		if (next != null)
			for (Weight weight : next)
				weight.result = result;
		return result;
	}
	
	/**
	 * Normalizes and computes the incoming weights.
	 * @param weights to be processed.
	 * @return the normalized and computed result.
	 */
	protected Double normalize(Weight ...weights) {
		/* TODO:Replace with matrix multiplication */
		double total = 0;
		for (Weight weight : weights)
			total += weight.weight * weight.result;
		
		return total + bias;
	}
	
	/**
	 * Runs the given activation function on normalized inputs.
	 * @param value of normalized inputs.
	 * @return the final result for given result after being run through inherited activation function.
	 */
	protected abstract Double activationFunc(Double value);
	
	/**
	 * Setter for the previous weights connected to this neuron.
	 * @param prev weights of this neuron.
	 */
	public void setPrev(Weight... prev) {
		this.prev = prev;
	}
	
	/**
	 * Setter for the weights connected after this neuron.
	 * @param next weights of this neuron.
	 */
	public void setNext(Weight... next) {
		this.next = next;
	}
	
	/**
	 * Getter for the weights connected before this neuron.
	 * @return all the weights connected before this neuron.
	 */
	public Weight[] getPrev() {
		return prev;
	}
	
	/**
	 * Getter for the weights connected after this neuron.
	 * @return all the weights connected after this neuron.
	 */
	public Weight[] getNext() {
		return next;
	}
}
