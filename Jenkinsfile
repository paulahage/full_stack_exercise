pipeline {
    agent { label 'nossoagent' }

    environment {
        JAVA_OPTS = '-Xmx1g'
    }

    stages {
        stage('build') {
            steps {
                sh '''
                    cd back
                    ./gradlew build
                '''
            }
        }
    }
}