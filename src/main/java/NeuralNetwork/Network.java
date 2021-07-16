package NeuralNetwork;

public class Network<I extends Neuron> {
	
	/**
	 * Constructs a network with given input neurons
	 * @param inputNeuron Type of input neurons for the network.
	 * @throws IllegalArgumentException if {@code inputNeuron} is 0. Must input at least one neuron.
	 */
	public Network(I... inputNeuron) {
		if (inputNeuron.length == 0)
			throw new IllegalArgumentException("Must input at least one neuron class");
	}
}

