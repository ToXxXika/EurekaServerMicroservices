pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
               withMaven(maven:'M3') {
                bat 'mvn clean install'
               }
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
     
    }
    post {
        always {
            // Actions to perform after the pipeline execution, like cleanup
            echo 'CourtierService pipeline execution completed.'
        }
    }
}
