node{
    stage("Pull Repo") {
        git  "git@github.com:jsartbaeva90/packer-infra.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}