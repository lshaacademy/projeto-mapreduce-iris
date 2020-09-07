package br.estacio.pos.uci.mapreduce.iris;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class QuantidadeIrisSetosaMapper extends Mapper<LongWritable, Text,Text,IntWritable>  {
	private final static IntWritable one = new IntWritable(1);

	@Override
	public void map(LongWritable key, Text value, Context context)
	throws IOException, InterruptedException{
				
		String line = value.toString();
		String[] instancia = line.split(",");
		String nome_flor = instancia[instancia.length-1];
				
		if(nome_flor.equals("Iris-setosa") ) {
			context.write(new Text(nome_flor), one);	
		}					
		
	}
}
