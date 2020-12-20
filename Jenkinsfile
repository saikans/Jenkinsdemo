pipeline {
	agent any
	tools {
    	maven 'apache-maven-3.6.3'
   }
	
	stages {
		stage('Compile') {
			steps {
				bat "mvn compile"
			}
		}
		stage('Test') {
			steps {
				bat "mvn test"
				
			}
		}
			
	}
}