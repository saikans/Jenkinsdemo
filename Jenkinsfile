pipeline {
	agent any
	
	stages {
		stage('Compile') {
			steps {
				bat 'mvn clean compile'
			}
		}
		stage('Test') {
			steps {
				bat 'mvn clean test'
				
			}
		}
			
	}
}