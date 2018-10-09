package layer;

import java.util.ArrayList;
import java.util.Random;

import neuralNetwork.Neuron;

public class Layer {
	ArrayList<Neuron>neurons = new ArrayList<>();

	public Layer(int numberOfNeurons) {
		initialize(numberOfNeurons);
	}
	public void initialize(int numberOfNeurons) {
		for(int i=0;i<numberOfNeurons;i++) {
			
			neurons.add(new Neuron(0));
		}
		
	}
	public ArrayList<Neuron> getNeurons() {
		return neurons;
	}
	public void setNeurons(ArrayList<Neuron> neurons) {
		this.neurons = neurons;
	}
	
}
