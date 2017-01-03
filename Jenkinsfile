/*Commit Stage*/
stage ('Commit Stage') {
	node {
	  def mvnHome = tool 'maven'
	  stage ('CheckOut Code') {
	    checkout scm
	  }
	
	  stage ('Compile') {
	    sh "'${mvnHome}/bin/mvn' clean"
	    sh "'${mvnHome}/bin/mvn' compile"
	  }
	
	  stage ('Unit-Tests') {
	    sh "'${mvnHome}/bin/mvn' test"
	  }
	}
}

node {
  def mvnHome = tool 'maven'
  stage ('Security')
  parallel 'FindSecBugs': {
    sh "'${mvnHome}/bin/mvn' findbugs:findbugs"  
  }, 'Dependencies': {
    echo 'Some Dependecy Checks when available'
  }, 'Licenses': {
    echo 'Some License Checks Tests when available'
  }, 'Code Coverage': {
    echo 'Some coverage Checks when available'
    /*sh "'${mvnHome}/bin/mvn' org.jacoco:jacoco-maven-plugin:check"*/
    /*sh "'${mvnHome}/bin/mvn' org.jacoco:jacoco-maven-plugin:report"*/
  }
}

node {
  def mvnHome = tool 'maven'  
  stage ('Packaging') {
    sh "'${mvnHome}/bin/mvn' war:war"
  }
  
  stage ('Containererstellung') {
    sh "'${mvnHome}/bin/mvn' docker:package"
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
