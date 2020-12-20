pipeline {
	agent any
	
	stages {
		stage('Compile') {
			steps {
				bat 'mvn clean test'
			}
		}
		stage('Test') {
			steps {
				bat 'mvn clean test'
				
			}
		}
			
	}
}