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
                withMaven(maven:'M3'){
                sh 'mvn clean install'
                }
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
     
    }
    post {
        always {
            // Actions to perform after the pipeline execution, like cleanup
            echo 'OrderService is up and running'
        }
    }
}
