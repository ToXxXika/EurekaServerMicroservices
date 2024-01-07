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
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run') {
            steps {
                // This starts the Spring Boot app in the background
                sh 'nohup mvn spring-boot:run &'
            }
        }
    }
    post {
        always {
            // Actions to perform after the pipeline execution, like cleanup
            echo 'RestaurantService is up and running'
        }
    }
}
