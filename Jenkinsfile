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

        stage('install node') {
            steps {
                sh '''
                    wget -qO- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.1/install.sh | bash
                    nvm install 18
                '''
            }
        }

        stage('install frontend dependencies') {
            steps {
                sh '''
                    cd front
                    npm install
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