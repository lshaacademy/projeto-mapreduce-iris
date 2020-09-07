# Trabalho de Pós Graduação Big Data e Ciência de Dados  
- Projeto-mapreduce-iris
- Disciplina Tecnologias Avançadas
- Leonardo Souza

Trabalho realizado utilizando o Ubuntu 20.4 em razão das dificuldades encontradas com o Hadoop da hortonworks como por exemplo, não existir mais a versão mencionada na disciplina, problemas com distribuição em que o hadoop simplesmente não existia, requisito de memória ram e outros.

# Hadoop - Pseudo Distribuído
O hadoop foi instalado e configurado no ubuntu, seguindo a documentação oficial, para operar no modo pseudo distribuído em que o yarn opera em single node e foi necessário aplicar configurações específicas nos arquivos do hadoop. 

Fonte: https://hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-common/SingleCluster.html

# Hadoop - Arquivos de Configuração
Os arquivos de configuração do hadoop para operar em single node foram versionados e estão disponíveis na pasta:

https://github.com/lshaacademy/hadoop-config-pseudo-distribuited-mode/tree/master/hadoop-config-files

Obs 1.: Os arquivos de config representam resultado de algumas horas pesquisando sobre configuração do hadoop e estão na minha pasta pessoal no github. 

Obs 2.:  Os arquivos de config do hadoop conforme citados acima e utilizados no projeto do trabalho resolvem problemas encontrados como por exemplo, a configuração
do % de uso de CPU, quantidade máxima de memória ram e a correta configuração do classpath no yarn-site.xml e sem essas configurações, o JOB é exibido no console como Running, mas na verdade não foi ativado.

# Hadoop - Aplicação MapReduce
A escrita do fonte mapreduce em java ocorreu no  Eclipse seguindo a apostila da própria disciplina e para execução do job foi escolhido um dataset da flor íris que é disponibilizado pela Universidade da Califórnia de Irvine.


- https://github.com/lshaacademy/projeto-mapreduce-iris/tree/master/iris


# Dataset
- https://archive.ics.uci.edu/ml/datasets/iris
- Pasta contendo o dataset https://github.com/lshaacademy/projeto-mapreduce-iris/tree/master/iris/data
