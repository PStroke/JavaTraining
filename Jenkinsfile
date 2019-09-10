pipeline {
    agent any
    stages {
        stage('build') {
                    steps {
                        echo 'Clean Install Mvn'
                        bat 'mvn clean install'
                    }
        }
    }
    post {
            always {
                junit 'build/reports/**/*.xml'
            }
        }
}
