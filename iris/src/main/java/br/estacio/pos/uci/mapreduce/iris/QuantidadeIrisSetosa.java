package br.estacio.pos.uci.mapreduce.iris;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.Text;

public class QuantidadeIrisSetosa extends Configured implements Tool {
	
  @Override
  public int run(String[] args) throws Exception {
	  
	  if(args.length != 3) {
		  System.err.printf("Utilização: %s[generic options]<input><output>\n",getClass().getSimpleName());
		  ToolRunner.printGenericCommandUsage(System.err);
		  return -1;		  
	  }
	  
	  Configuration conf = this.getConf();
	  Job job = new Job(conf);
	  job.setJarByClass(QuantidadeIrisSetosa.class);
	  job.setJobName("Quantidade de flores setosa");
	  FileInputFormat.addInputPath(job, new Path(args[1]));
	  FileOutputFormat.setOutputPath(job, new Path(args[2]));
	  job.setMapperClass(QuantidadeIrisSetosaMapper.class);
	  job.setReducerClass(QuantidadeIrisSetosaReducer.class);
	  job.setOutputKeyClass(Text.class);
	  job.setOutputValueClass(IntWritable.class);
	  
	  return job.waitForCompletion(true) ? 0: 1; 
		  		  		  		
  }
  
  public static void main(String[] args) throws Exception {
	  int exitCode = ToolRunner.run(new QuantidadeIrisSetosa(), args);
	  System.exit(exitCode);
  }
}
