pipeline {
	agent any
	mvnHome = tool 'M3'
	
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