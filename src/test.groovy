job('gitco') {
    scm {
        git {
            remote {
                name('remoteB')
                url('git@github.com:pratap8482/dsl-test.git')
            }
            extensions {
                cleanAfterCheckout()
                relativeTargetDirectory('repo1')
            }
        }
    }
}