 pipeline {
    agent any

    environment {
        XRAY_CLIENT_ID = '7F5AC0FB3EBD4BD48A66D485CC9FAD2E'
        XRAY_CLIENT_SECRET = '90cbc3ad-82a1-4daa-93c6-350d861d1709'
        JIRA_URL = 'https://tresit.atlassian.net/'
        PROJECT_KEY = 'https://tresit.atlassian.net/jira/software/c/projects/QAD/boards/242'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/framqa/automation.git'
            }
        }
        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn verify'
            }
        }
        stage('Publish Results to Xray') {
            steps {
                script {
                    def jsonFile = 'target/serenity/cucumber.json'
                    def xrayTestExecution = "curl -X POST ${JIRA_URL}/rest/raven/1.0/import/execution/cucumber -H 'Content-Type: application/json' -u ${XRAY_CLIENT_ID}:${XRAY_CLIENT_SECRET} -d @${jsonFile}"
                    sh "${xrayTestExecution}"
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
