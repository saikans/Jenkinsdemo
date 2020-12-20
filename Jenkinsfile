pipeline {
	agent any
	tools {
    maven 'Maven3.6.3'
    jdk 'JDK8'
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