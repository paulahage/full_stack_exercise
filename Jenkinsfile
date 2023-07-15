pipeline {
    agent { label 'nossoagent' }
    stages {
        stage('build') {
            steps {
                sh './gradlew build'
            }
        }
    }
}