pipeline {
    agent none

    environment {
        JAVA_OPTS = '-Xmx1g'
    }

    stages {

        stage('backend'){
            agent {
                docker { image 'openjdk:21-slim' }
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
            }
        }

        stage('frontend') {
            agent {
                docker { image 'node:18.16.0-alpine' }
            }

            stages {

                stage('install dependencies') {
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
    }

    post {
        always {
            cleanWs()
        }
    }
}