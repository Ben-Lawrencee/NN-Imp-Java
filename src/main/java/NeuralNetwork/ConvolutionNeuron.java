package NeuralNetwork;

import java.awt.image.BufferedImage;

public abstract class ConvolutionNeuron<U, Y> extends Neuron {
	
	/**
	 * Process a given image, then return output of specified type.
	 * @return output of specified type after processing.
	 */
	public abstract Y evaluate(BufferedImage image);
}
