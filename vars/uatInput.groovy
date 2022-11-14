public class uatInput {

  def buildIsUatApproved() {
    def file = new File("/var/jenkins_home/workspace/build-approved.txt")
    
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
  }

  def buildIsTestApproved() {
    def file = new File("/var/jenkins_home/workspace/test-approved.txt")

    if (file.exists()) {
      return true;
    }
    else {
      println "Approval file does not exist"
    }
    return false;
  }

  def buildIsReleaseApproved() {
    def file = new File("/var/jenkins_home/workspace/release-approved.txt")

    if (file.exists()) {
      return true;
    }
    else {
      println "Approval file does not exist"
    }
    return false;
  }

}
