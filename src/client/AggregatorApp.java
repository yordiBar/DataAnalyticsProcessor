package client;

import aggregators.AggregatorProcessor;
import aggregators.MeanAggregator;

import java.io.IOException;

public class AggregatorApp {

	public static void main(String[] args) throws IOException {

		MeanAggregator agg = new MeanAggregator();
		AggregatorProcessor<MeanAggregator> aggsProcessor = new AggregatorProcessor<>(agg, "table.csv");
		double value = aggsProcessor.runAggregator(1);
		System.out.println(value);
	

	}

}
