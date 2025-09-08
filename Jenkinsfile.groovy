pipeline{
    agent any
    stages{
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/yewfuli41/SCCPracExercise.git'
            }
        }
        stage('Build') {
            steps { bat 'gradlew build'}
        }
        stage('Test') {
            steps { bat 'gradlew test'}
        }
        stage('Deploy') {
            steps {
                bat 'java -jar build/libs/SCCPracticalExercise-1.0.jar'
            }
        } 
    }
}//hello