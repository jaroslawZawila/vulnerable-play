node('slave') {
    withCredentials([string(credentialsId: 'BINTRAY_API_KEY', variable: 'BINTRAY_API_KEY')]) {
        env.BINTRAY_USER = 'ovo-payments'

        def region = "eu-west-1"
        def s3Bucket = "payments-lambda-repo"
        def s3Prefix = "comms-lambdas"
        checkout scm
        def gitCommitSha = sh(script: "git rev-parse HEAD", returnStdout: true).trim()

        try {
            stage('lint and test') {
                sh "sbt -ivy /home/jenkins/ivy assembly"
            }
        }
        finally {
            echo 'Clean workspace'
            cleanWs()
        }

    }
}