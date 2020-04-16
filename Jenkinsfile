pipeline {
  agent any
  tools {
     maven 'Maven 3.3.9'
     jdk 'jdk8'
    }
    
  stages {
    stage ('Initialize'){
     steps {
     echo "PATH = ${PATH}"
     echo "M2_HOME = ${M2_HOME}"
     }
    }
    stage ('Build') {
      steps {
        echo 'Running build automation'
        sh 'mvn clean install -DskipTests=true'
        archiveArtifacts artifacts: 'dist/SapientCric-0.0.1-SNAPSHOT.zip'
      }
    }
  }
}