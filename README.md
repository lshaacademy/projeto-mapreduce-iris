# Trabalho de Pós Graduação Big Data e Ciência de Dados  
- projeto-mapreduce-iris
- Disciplina Tecnologias Avançadas
- Leonardo Souza

Trabalho realizado utilizando o Ubuntu 20.4 em razão das dificuldades encontradas com o Hadoop da hortonworks como por exemplo, não existir mais a versão mencionada na disciplina, problemas com distribuição em que o hadoop simplesmente não existia, requisito de memória ram e outros.

O hadoop foi instalado e configurado no ubuntu, seguindo a documentação oficial, para operar no modo pseudo distribuído em que o yarn opera em single node e foi necessário aplicar configurações específicas nos arquivos do hadoop. Os arquivos de configuração foram versionados e estão disponíveis no github do projeto.
A escrita do fonte mapreduce em java ocorreu no Eclipse seguindo a apostila da própria disciplina e para execução do job foi escolhido um dataset da flor íris que é disponibilizado pela Universidade da Califórnia de Irvine. 


# hadoop-config-pseudo-distribuited-mode
https://hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-common/SingleCluster.html



https://archive.ics.uci.edu/ml/datasets/iris
