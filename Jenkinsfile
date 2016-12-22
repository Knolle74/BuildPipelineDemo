/*Commit Stage*/
node {
  def mvnHome = tool 'maven'
  stage ('CheckOut Code') {
    checkout scm
/*    sh 'mvn package docker:package' */
  }

  stage ('Compile/Package') {
    sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package docker:package"
  }

  stage ('Unit-Tests') {
    echo 'Some Unit Tests when available'
  }

  stage ('Coverage Checks') {
    sh "'{mvnHome}/bin/mvn' -Dmaven test.failure.ignore report"
  }

  stage ('FindSecBugs') {
    echo 'Some FindSecBugs Tests when available'  
  }

  stage ('Dependencys') {
    echo 'Some Dependecy Checks when available'
  }

  stage ('Licences') {
    echo 'Some License Checks Tests when available'
  }
}

/*Acceptance Stage*/

node {
  stage ('Arachni') {
    echo 'Some Arachni Tests when available'
/*    sh 'docker run --name=Artefakt Artefakt' */
/*    sh 'docker run --link(Artefakt) Arachni' */
/*    sh 'rest Aufruf an Arachni scan mit post von url der Application' */
  }
    
  stage ('test') {
    echo 'Some IsAlive Tests when available'
/*    sh 'docker run -it -p 8080:8080 lars/test:1.0-SNAPSHOT' */
/*    sh '200er Test gegen Application URL' */    
  }
}
