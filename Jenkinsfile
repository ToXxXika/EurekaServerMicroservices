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
        
    }
    post {
        always {
            // Actions to perform after the pipeline execution, like cleanup
            echo 'Kitchenservice is up and running'
        }
    }
}
