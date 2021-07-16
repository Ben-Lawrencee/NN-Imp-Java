import NeuralNetwork.Network;
import NeuralNetwork.ReLUNeuron;

public class Main {
	public static void main(String[] args) {
		
		
		Network<ReLUNeuron> network = new Network<ReLUNeuron>();
		
		ReLUNeuron neuron = new ReLUNeuron(1);
		
		System.out.println(neuron.evaluate());
		
		
		/*
		ArtificialNetworkBuilder builder = new ArtificialNetworkBuilder();
		Network network = builder
							.addLayer(ReLUNeuron.class)
		
		NetworkBuilder builder = new NetworkBuilder<BufferedImage.class, Double>();
		Network network = builder
		
		
		NetworkBuilder builder = new NetworkBuilder();
		Network network = builder
				.setType(NetworkBuilder.Type.IMAGE)
				.setType(NetworkBuilder.Type.INTEGRAL)
				.addLayer(CONVOLUTIONAL)
				.addLayer(MAX_POOL)
				.addLayer(MIN_POOL)
				.addLayer(AVG_POOL)
				.addLayer(ReLU)
				.addLayer(FULLY_CONNTECTED)
				.addLayer(LOSS)
				.build();*/
	}
}
