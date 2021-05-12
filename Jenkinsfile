pipeline {
    agent any

    stages {
        stage('Build Assets') {
            agent any
            steps {
                script:
                  - ./gradlew check
                  - ./gradlew codeCoverageReport
            }
        }
        stage('Test') {
            agent any
            steps {
               after_success:
                - bash <(curl -s https://codecov.io/bash)
            }
        }
    }
}