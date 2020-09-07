# Trabalho de Pós Graduação Big Data e Ciência de Dados  
- Projeto-mapreduce-iris
- Disciplina Tecnologias Avançadas
- Leonardo Souza

Trabalho realizado utilizando o Ubuntu 20.4 em razão das dificuldades encontradas com o Hadoop da hortonworks como por exemplo, não existir mais a versão mencionada na disciplina, problemas com distribuição em que o hadoop simplesmente não existia, requisito de memória ram e outros.

# Hadoop - Pseudo Distribuído
O hadoop foi instalado e configurado no ubuntu, seguindo a documentação oficial, para operar no modo pseudo distribuído em que o yarn opera em single node e foi necessário aplicar configurações específicas nos arquivos do hadoop. 

Fonte: https://hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-common/SingleCluster.html

# Arquivos de Configuração
Os arquivos de configuração do hadoop para operar em single node foram versionados e estão disponíveis na pasta:

https://github.com/lshaacademy/hadoop-config-pseudo-distribuited-mode/tree/master/hadoop-config-files

Obs 1.: Os arquivos de config representam resultado de algumas horas pesquisando sobre configuração do hadoop e estão na minha pasta pessoal no github. 

Obs 2.:  Os arquivos de config do hadoop conforme citados acima e utilizados no projeto do trabalho resolvem problemas encontrados como por exemplo, a configuração
do % de uso de CPU, quantidade máxima de memória ram e a correta configuração do classpath no yarn-site.xml e sem essas configurações, o JOB é exibido no console como Running, mas na verdade não foi ativado.

# Dataset
Para proccessamento foi escolhido um dataset da flor de Íris que é disponibilizado pela Universidade da Califórnia de Irvine. Foi realizado o download do dataset que é consideravelmente pequeno e por esta razão foi versionado junto com o projeto conforme o link abaixo:

- https://archive.ics.uci.edu/ml/datasets/iris
- Pasta contendo o dataset https://github.com/lshaacademy/projeto-mapreduce-iris/tree/master/iris/data

# Projeto Mapreduce Flor de Íris
O projeto consiste em um aplicação simples de mapreduce escrita em java para verificar em um dataset da flor iris qual a quantidade da espécie setosa levando em consideração que dentro deste mesmo dataset existe as espécies setosa, virginica e versicolor. A escrita do fonte mapreduce ocorreu no  Eclipse, projeto de maven, seguindo a apostila da própria disciplina.



# Execução ( Instalação do Hadoop 100% ok)

 start-dfs.sh
 start-yarn.sh
 hdfs dfs -mkdir /data-iris/input
 hdfs dfs -ls /data-iris/
 hdfs dfs -put *.data /data-iris/input 
 yarn jar app-iris.jar  QuantidadeIrisSetosa /data-iris/input /data-iris/output
 hdfs dfs -cat /data-iris/output/part-r-00000
 Resultado: Iris-setosa	50
