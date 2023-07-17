pipeline {
    agent none

    stages {

        stage('backend'){
            agent {
                docker { image 'openjdk:19-jdk-alpine' }
            }

            environment {
                JAVA_OPTS = '-Xmx1g'
                GRADLE_USER_HOME = '.'
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
                docker { image 'node:18-alpine' }
            }

            environment {
                HOME = '.'
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
}