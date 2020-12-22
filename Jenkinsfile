pipeline {
	agent any
	tools {
    	maven 'M3'
 	 }
	
	stages {
		stage('Compile') {
			steps {
				bat 'mvn compile'
			}
		}
		stage('Test') {
			steps {
				bat 'mvn test'
				
			}
		}
	}
}