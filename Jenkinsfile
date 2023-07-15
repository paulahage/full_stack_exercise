pipeline {
    agent { label 'nossoagent' }

    environment {
        JAVA_OPTS = '-Xmx1g'
    }

    stages {
        stage('build backend') {
            steps {
                sh '''
                    cd back
                    ./gradlew build -x test
                '''
            }
        }

        stage('test backend') {
            steps {
                sh '''
                    cd back
                    ./gradlew test
                '''
            }
        }

        stage('build frontend') {
            steps {
                sh '''
                    cd front
                    ng build
                '''
            }
        }
    }
}