pipeline {
	agent any
	tools {
		maven 'maven-3.8.5'
	}
	stages {
		stage('Build with unit testing') {
			steps {
				echo 'Building...' + env.BRANCH_NAME
			}
		}
		stage ('Initialize') {
            		steps {
                		sh '''
                    			echo "PATH = ${PATH}"
                    			echo "M2_HOME = ${M2_HOME}"
                		'''
            		}
        	}
		stage('Docker compose build') {
        		steps {
            			sh 'docker compose up -d --force-recreate --remove-orphans --build'
        		}
    		}
	}
}
