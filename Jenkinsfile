pipeline {
    agent any {
        stages {
                stage('Test') {
                    steps {
                        echo 'Hello Bro'
                    }
                }
        }
        post {
                always {
                    echo 'I will always say Hello again!'
                }
            }
    }
}
